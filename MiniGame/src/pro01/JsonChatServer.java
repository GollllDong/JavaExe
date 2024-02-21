package pro01;

import java.io.*;
import java.net.*;
import java.sql.*;
import org.json.*;

public class JsonChatServer {
    public static void main(String[] args) {
        final int PORT = 9797;

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("서버가 열렸습니다. 사용자를 기다려주세요...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("클라이언트가 연결되었습니다 : " + socket);

                // Handle client connection in a separate thread
                ClientHandler clientHandler = new ClientHandler(socket);
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler extends Thread {
    private Socket socket;
    private Connection connection;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        try {
            // 데이터 베이스와 연결
            connection = DriverManager.getConnection("jdbc:mysql://192.168.0.28:3306/SubwayInformation", "root", "12345678");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

            String input;
            while ((input = br.readLine()) != null) {
                JSONObject jsonInput = new JSONObject(input);

                // 사용자 입력을 다루는 부분
                if (jsonInput.has("Input")) {
                    String guess = jsonInput.getString("Input");
                    boolean isCorrect = validateGuess(guess);

                    JSONObject response = new JSONObject();
                    response.put("result", isCorrect ? "존재하는 역입니다!" : "존재하지 않는 역입니다!");
                    pw.println(response.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean validateGuess(String Input) {
        // 데이터베이스에 내가 입력한 역 이름이 존재하는지 확인
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT COUNT(*) FROM SubwayInformation WHERE line_number = ?");
            statement.setString(1, Input);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
