package ch09.resolve14.resolve3;

import java.util.Scanner;

public class BaseBallMain {

	public static void main(String[] args) {
		/*
		 * 3. 삼진아웃게임을 만듭니다 두 사람중에 한 사람이 0~9까지 3개의 숫자중 중복없이 임의의 숫자를 선택합니다 예를 들어 3 1 9를
		 * 선택했다면 다른 한사람이 3개의 숫자를 맞추고 결과를 응답받습니다 같은 숫자 동일한 자리일 경우 1스트라이크 같은 숫자 다른 자리일 경우
		 * 1볼입니다 세자리 숫자 모두 자리까지 일치할 경우는 삼진아웃!!으로 처리합니다
		 * 
		 * 클래스를 구현하세요 GeneratorThreeNum // 난수 3개를 생성하는 역할 BaseBallMenu // 메뉴를 담당하는 역할
		 * DecisionBall // 스트라이크, 볼을 판단하는 역할 BaseBallMain // main메서드를 실행하는 역할
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 >>> ");
		int value1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 >>> ");
		int value2 = sc.nextInt();
		System.out.println("세번째 숫자 입력 >>> ");
		int value3 = sc.nextInt();
		
		DecisionBall db = new DecisionBall(value1, value2, value3);
		
		sc.close();

	}

}
