package ch06.method01;

import java.util.Scanner;

public class Resolve1 {
	
	public static int big(int tmp1, int tmp2) {
		return tmp1 > tmp2 ? tmp1 : tmp2;
		
	}
	public static int small(int tmp1, int tmp2) {
		return tmp1 < tmp2 ? tmp1 : tmp2;
	}

	public static void main(String[] args) {
		// 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
		// 작은 값을 반환하는 메서드를 작성하고 사용하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 값 입력 : ");
		int tmp1 = sc.nextInt();
		System.out.print("2번째 값 입력 : ");
		int tmp2 = sc.nextInt();
		
		
		System.out.println("큰 값 : "+big(tmp1,tmp2));
		System.out.println("작은 값 : " + small(tmp1,tmp2));
		
//		if(tmp1 > tmp2) { // 1번째 값이 더 클 경우
//			big(tmp1);    // 1번째 값을 big 메소드에 할당
//			small(tmp2);  // 2번째 값을 small 메소드에 할당
//		}else if (tmp1 < tmp2) { // 2번째 값이 더 클 경우
//			small(tmp1); // 1번째 값을 small 메소드에 할당
//			big(tmp2);  // 2번째 값을 big 메소드에 할당
//		}
//		else {
//			System.out.println("잘못된 입력값입니다.");
//		}
	
	}

}
