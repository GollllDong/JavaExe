package ch06.method01;

import java.util.Scanner;

public class Resolve1 {
	
	public static int big(int tmp1, int tmp2) {
		if (tmp1 > tmp2) {
			return tmp1;
		}
		else {
			return tmp2; // 여기 부분에서 작은 값 리턴
		}
		
	}
//	public static int small(int tmp1) {
//		
//	}

	public static void main(String[] args) {
		// 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
		// 작은 값을 반환하는 메서드를 작성하고 사용하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번째 값 입력 : ");
		int tmp1 = sc.nextInt();
		System.out.println("2번째 값 입력 : ");
		int tmp2 = sc.nextInt();
		int result = big(tmp1, tmp2);
		System.out.println(result);
	

	}

}
