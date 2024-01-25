package ch03.for10;

import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {
		System.out.println("정수를 입력해주세요 : (1~99)");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int ten_place = num / 10; //십의자리 
		int one_place = num % 10; //일의자리 
		if((ten_place == 3 || ten_place == 6 || ten_place == 9) && (one_place == 3 || one_place == 6 || one_place == 9)) {
			System.out.println("박수짝짝");
		}
		else if(one_place == 3 || one_place == 6 || one_place == 9) { //일의자리
			System.out.println("박수짝");
		}else if(ten_place == 3 || ten_place == 6 || ten_place == 9 ) { //십의자리 
			System.out.println("박수짝");
		}

	}

}
