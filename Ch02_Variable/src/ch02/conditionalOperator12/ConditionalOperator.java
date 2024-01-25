package ch02.conditionalOperator12;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~100사이의 숫자 입력 >>>");
		num = sc.nextInt();
		// 1) 삼항(조건)연산자 사용
		// A ? B : c;  A가 참이면 B를 실행하고 아니라면 C를 실행해라
		str = num >= 85 ? "상위권입니다." : "상위권에 미치지 못합니다.";
		

		// 2) 조건문 사용
//		if(num >= 85) {
//			str = ("상위권입니다.");
//		}else {
//			str = ("상위권에 미치지 못합니다.");
//		}
		System.out.println(str);
		
		sc.close();
	}

}
