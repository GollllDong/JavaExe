package ch01.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {

		// Stack 컬렉션 생성
		Queue<Message> messageQueue = new LinkedList<>();

		// 메시지 넣기
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "전우치"));
		messageQueue.offer(new Message("sendKakaoTalk", "이자바"));

		// 메시지를 하나씩 꺼내어 처리
		while (!messageQueue.isEmpty()) { // 비어있지 않다면 반복
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaoTalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}
}