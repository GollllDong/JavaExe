package ch06.method01;

import java.util.Scanner;

public class Resolve2 {
	
	static void pr(int value1, int value2) {
		if(value1 < 0) {
			value1 = -value1 + value1; 
		}else if (value2 < 0) {
			value2 = -value2 + value2; 
		}
		int result = value1;
		int result2 = value2;
		System.out.println(result);
		System.out.println(result);
		if (result > result2) {
			int a = result - result2;
			System.out.println(a);
		}
		else if (result < result2) {
			int b = result2 - result;
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) {
//		두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
//		사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
//		절대값이 계산되어서 출력되어야 합니다
		Scanner sc = new Scanner(System.in);
		

		System.out.println("1번째 값 입력 >>> ");
		int value1 = sc.nextInt();
		System.out.println("2번째 값 입력 >>> ");
		int value2 = sc.nextInt();
		pr(value1, value2);
		
		sc.close();
	}


}
