package pro01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonChatClient {
	public static void main(String[] args) {
		final String IP = "localhost";
		final int PORT = 9797;
		System.out.println("서버에 연결을 시도합니다");
		try {
			// 서버 연결 //
			Socket socket = new Socket(IP, PORT);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

			System.out.println("서버에 연결되었습니다.");

//4. 메뉴화면 읽고 호선입력하고 서버로 선택한 호선 전송//
			for (int i = 0; i < 15; i++) {
				String packet = br.readLine();
				System.out.println(packet);
			}
			System.out.println("호선을 선택하세요 >> ");
			
			
//            

//6. 게임 시작 버튼 클릭 (0번 입력)

//8.입력 로직 반복 (역 이름 작성후 서버로 전송)//

			while (true) {
				System.out.print("역 이름을 입력하세요: ");
				String Input = br.readLine();

				JSONObject jsonInput = new JSONObject();
				jsonInput.put("Input", Input);

				// 당신의 입력값을 서버로 보냄
				pw.println(jsonInput.toString());

				// 서버의 응답을 받고 보여준다
				String response = br.readLine();
				JSONObject jsonResponse = new JSONObject(response);
				System.out.println("서버 응답 : " + jsonResponse.getString("result"));
			}
		} catch (IOException | JSONException e) {
			e.printStackTrace();
		}
	}
}