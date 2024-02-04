package ch09.resolve14.resolve1;

import java.util.Scanner;

public class PrinterMain {
	/*
	 * 1. 다음 상속구조를 설계하세요 모든 프린터는 모델명, 제조사, 인터페이스 종류(USB, paraller port), 인쇄매수, 인쇄 종이
	 * 잔량을 나타내는 정보를 가진다 print()메서드를 갖는다. 잉크젯프린터는 잉크 잔량이라는 추가 정보를 가진다 레이저프린터는 토너
	 * 잔량이라는 추가 정보를 가진다 print()메서드는 각 프린터 타입에 맞게 구현한다 편의상 print()메서드를 한 번 호출할 때마다
	 * 인쇄용지 1매를 사용하는 것으로 한다 클래스들을 설계하고 적절한 필드, 생성자, 메서드를 작성하세요 그리고 실행 프로그램을 작성해서
	 * 동작시키세요
	 */

	public static void main(String[] args) {
		// 입력을 받아서 호출
		Scanner sc = new Scanner(System.in);
		System.out.println("모델명 : ");
		String num1 = sc.next();
		System.out.println("제조사 : ");
		String num2 = sc.next();
		System.out.println("인터페이스 종류(USB, parallers port) : ");
		String num3 = sc.next();
		System.out.println("현재 인쇄매수 : ");
		int num4 = sc.nextInt();
		System.out.println("남은 인쇄종이 : ");
		int num5 = sc.nextInt();
		System.out.println("토너 잔량 : ");
		int num6 = sc.nextInt();
		System.out.println("반복 횟수 : ");
		int num7 = sc.nextInt();
		LazerPrinter lazer = new LazerPrinter(num1, num2, num3, num4, num5, num6,num7);
		lazer.print();
		
		System.out.println("남은 인쇄종이 : " + lazer.view_remain());
		
		
		System.out.println("------------------------------");
		
		// 기본 생성자 초기화로 호출
		InkPrinter ink = new InkPrinter("SL-T1672W", "삼성", "USB-C", 10, 5, 50, 15);
		ink.print();
		System.out.println("남은 인쇄종이 : " + ink.view_remain());
		
		

		sc.close();
	}

}
