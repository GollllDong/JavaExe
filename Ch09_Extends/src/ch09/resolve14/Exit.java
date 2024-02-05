package ch09.resolve14;

import java.util.Scanner;

public class Exit implements IQuestionAnswer { // 빠져나가는 기능만 하는 구조

	@Override
	public void question() {
		String question = "4. Exit\r\n\r\n";

		System.out.println(question);

	}

	@Override
	public void answer(Scanner sc) {

	}

	@Override
	public boolean isRun() {	// Exit클래스에서만 return을 false로 해주면서 탈출시킨다.
		return false;
	}

}
