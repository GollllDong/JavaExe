package pro01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.json.JSONObject;

public class JsonChatServer {
	public static void main(String[] args) {
		final int PORT = 9797;

		try (ServerSocket serverSocket = new ServerSocket(PORT)) {
			System.out.println("서버가 열렸습니다. 사용자를 기다려주세요...");

			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트가 연결되었습니다 : " + socket);
// 2. 클라이너트 로직 연결

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
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

			System.out.println("teast");
			// 3. 클라이언트에게 메뉴화면 보여주기
			pw.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
//            pw.flush();
			pw.println("+      ===========지하철 게임===========");
//            pw.flush();
			pw.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
//            pw.flush();
			pw.println("|              게임 이용 방법                   |");
//            pw.flush();
			pw.println("| 1) 1번 플레이어가 게임을 원하는 호선을 입력         |");
			pw.flush();
			pw.println("| 2) 숫자 0 입력시 게임이 시작됩니다.               |");
			pw.flush();
			pw.println("| 3) 제한시간 5초안에 해당 호선의 역을 입력           |");
			pw.flush();
			pw.println("|!! ===========!!!주의사항!!!=========== !!    |");
			pw.flush();
			pw.println("|        !!답 입력시 '역'은 생략해주세요.!!         |");
			pw.flush();
			pw.println("|Space bar나 .을 사용하면 오답 처리될 수 있습니다.!!  |");
			pw.flush();
			pw.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
			pw.flush();
			pw.println("|          현재는 2~4호선만 가능합니다.            |");
			pw.flush();
			pw.println("|+-------------------------------------------+");
			pw.flush();

			System.out.println("teast");

			// 5. 호선 입력 받고 해당 호선에 대한 역 이름 DB에서 가져오기 + 클라로 게임시작 정보 보내기

			// 7. 게임 시작 버튼 클라이언트에게 받기 -> 게임 시작(게임을 시작합니다.) 전송

			// 9.클라이언트가 입력 받은걸 처리 (게임 실행 처리) **무한반복** // 콘솔에서 만들어놓은걸 서버랑 클라이언트랑 통신하는 방법으

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
			// 데이터 베이스와 연결
			connection = DriverManager.getConnection("jdbc:mysql://192.168.0.28:3306/SubwayInformation", "root",
					"12345678");
			PreparedStatement statement = connection
					.prepareStatement("SELECT COUNT(*) FROM SubwayInformation WHERE line_number = ?");
			statement.setString(1, Input);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				int count = resultSet.getInt(1);
				return count > 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
