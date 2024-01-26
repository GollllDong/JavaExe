package ch03.for10;

import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {
		while(true) {
			System.out.println("정수를 입력해주세요 : (1~99), 0번 입력시 프로그램 종료");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int n10 = num / 10;
			int n1 = num%10;
			int cnt = 0;
			
			if (num == 0) {
				break;
			}
			
			if(n10 == 3 || n10 == 6 || n10 == 9) {
				cnt++;
			}
			if(n1 == 3 || n1 == 6 || n1 == 9) {
				cnt++;
			}
			if(cnt == 1 ) {
				System.out.println("박수짝");
			}else {
				System.out.println("박수짝짝");
			}
		}System.out.println("프로그램 종료");

//		int ten_place = num / 10; //십의자리 
//		int one_place = num % 10; //일의자리 
//		if((ten_place == 3 || ten_place == 6 || ten_place == 9) && (one_place == 3 || one_place == 6 || one_place == 9)) {
//			System.out.println("박수짝짝");
//		}
//		else if(one_place == 3 || one_place == 6 || one_place == 9) { //일의자리
//			System.out.println("박수짝");
//		}else if(ten_place == 3 || ten_place == 6 || ten_place == 9 ) { //십의자리 
//			System.out.println("박수짝");
//		}
		
	}

}
