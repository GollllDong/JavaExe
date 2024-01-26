package ch03.for10;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		int num1, num2, num3 = 0;
		System.out.println("3개의 수로 삼각형 만들기 (조건 : 두 변의 합이 다른 한 변의 합보다 반드시 커야한다.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 정수 입력 >>> ");
		num1 = sc.nextInt();
		System.out.print("2번째 정수 입력 >>> ");
		num2 = sc.nextInt();
		System.out.print("3번째 정수 입력 >>> ");
		num3 = sc.nextInt();
		
		boolean result1 = (num1 + num2) > num3 && (num1 + num3) > num2 ? true : false ;
		boolean result2 = (num2 + num3) > num1 ? true : false;
		String value = result1 && result2 ? "삼각형 생성!!" : "삼각형 생성이 불가능합니다.";
		
		System.out.println(value);
		

	}

}
