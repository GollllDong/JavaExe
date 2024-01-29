package ch06.method01;

import java.util.Scanner;

// 메서드를 만들기 전 코드
public class MethodEx3 {

	// num0과 num1은 add함수의 지역변수이다. 이름만 같을 뿐 다른 변수이다.
	public static int add(int num0, int num1) {
		int result = num0 + num1;
		return result;
	}

	public static void main(String[] args) {
		// main함수의 지역변수로 Stack에 num0, num1이 초기화되어 생성된다.
		int num0 = 10, num1 = 5;
		int result = add(num0, num1);
		System.out.println("결과값은 : " + result);
		
		int a = 3, b = 7;
		int result1 = add(a,b);
		System.out.println("결과값은 : " + result1);
	}
}






