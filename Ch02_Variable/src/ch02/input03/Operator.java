package ch02.input03;

import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		int result = 0;
		int num1 = 0, num2 = 0;
		
		
		// 라이브러리 (jdk를 포함한)에 존재하는 클래스는 ctrl+shift+o 
		// package경로에 자동 등록
		// jdk에 있는 클래스
		Scanner sc = new Scanner(System.in);
		System.out.println("더하기 연산 : ");
		System.out.print("1번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("2번째 숫자 : ");
		num2 = sc.nextInt();
		
		// 결과 계산
		// =(대입 연산자)는 우측의 연산이 모두 완료된 후 처리된다.
		result = num1 + num2;
		System.out.println("결과는 : " + result);
		
		sc.close(); // 키보드 연결 닫아줌
	}
}
