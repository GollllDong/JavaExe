package pro01;

import java.io.*;
import java.net.*;
import org.json.*;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonChatClient {
    public static void main(String[] args) {
        final String IP = "192.168.0.28";
        final int PORT = 9797;
        System.out.println("서버에 연결을 시도합니다");
        try {
            Socket socket = new Socket(IP, PORT);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

            System.out.println("서버에 연결되었습니다.");

            while (true) {
                System.out.print("역 이름을 입력하세요: ");
                String Input = br.readLine();

                JSONObject jsonInput = new JSONObject();
                jsonInput.put("입력", Input);

                // 당신의 입력값을 서버로 보냄
                pw.println(jsonInput.toString());

                // 서버의 응답을 받고 보여준다
                String response = socketReader.readLine();
                JSONObject jsonResponse = new JSONObject(response);
                System.out.println("서버 응답 : " + jsonResponse.getString("result"));
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}