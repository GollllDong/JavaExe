package ch06.method01;

import java.util.Scanner;

public class Resolve1 {
	
	public static int big(int tmp1) {
		System.out.println("큰 값 : " + tmp1);
		return tmp1;
	}
	public static int small(int tmp2) {
		System.out.println("작은 값 : " + tmp2);
		return tmp2;
	}

	public static void main(String[] args) {
		// 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
		// 작은 값을 반환하는 메서드를 작성하고 사용하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번째 값 입력 : ");
		int tmp1 = sc.nextInt();
		System.out.println("2번째 값 입력 : ");
		int tmp2 = sc.nextInt();
		
		if(tmp1 > tmp2) {
			big(tmp1);
		}else if (tmp1 < tmp2) {
			small(tmp2);
		}
		else {
			System.out.println("잘못된 입력값입니다.");
		}
	
	}

}
