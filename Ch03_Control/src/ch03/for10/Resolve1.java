package ch03.for10;

import java.util.Scanner;

public class Resolve1 {

	public static void main(String[] args) {
		while(true) {
			int money = 0;
			System.out.println("입금할 금액 입력 (종료는 0입력) >>> ");
			Scanner sc = new Scanner(System.in);
			money = sc.nextInt(); 
			
			if(money == 0) {
				break;
			}
			
			int m50000 = money / 50000;
			money = money % 50000;
			
			int m10000 = money / 10000;
			money = money % 10000;
			
			int m5000 = money / 5000;
			money = money % 5000;
			
			int m1000 = money / 1000;
			money = money % 1000;
			
			int m500 = money / 500;
			money = money % 500;
			
			int m100 = money / 100;
			money = money % 100;
			
			int m50 = money / 50;
			money = money % 50;
			
			int m10 = money / 10;
			money = money % 10;
			
			int m1 = money / 1;
			money = money % 1;
			
			System.out.printf("50000원 : %d\n" 
			+ "10000원 : %d\n" 
			+ "5000원 : %d\n"
			+ "1000원 : %d\n"
			+ "500원 : %d\n"
			+ "100원 : %d\n"
			+ "50원 : %d\n"
			+ "10원 : %d\n"
			+ "1원 : %d\n" ,m50000, m10000, m5000, m1000, m500, m100, m50, m10, m1);
			
		}System.out.println("End");
		
	}
}
	
//		int value1 = 0;
//		int value2 = 0;
//		int value3 = 0;
//		int value4 = 0;
//		int value5 = 0;
//		int value6 = 0;
//		int value7 = 0;
//		int value8 = 0;
//		
//		while(money ==0) {
//			
//		}
//		if(money > 0) {
//			value1 = money / 50000;
//			money -= 50000*value1;
//			System.out.println("5만원 : " + value1);
//		}if(money > 0) {
//			value2 = money /10000;
//			money -= 10000 * value2;
//			System.out.println("1만원 : " + value2);
//		}if(money > 0) {
//			value3 = money /5000;
//			money -= 5000 * value3;
//			System.out.println("5000원 : " + value3);
//		}if(money > 0) {
//			value4 = money /1000;
//			money -= 1000 * value4;
//			System.out.println("1000원 : " + value4);
//		}if(money > 0) {
//			value5 = money /500;
//			money -= 500 * value5;
//			System.out.println("500원 : " + value5);
//		}if(money > 0) {
//			value6 = money /100;
//			money -= 100 * value6;
//			System.out.println("100원 : " + value6);
//		}if(money > 0) {
//			value7 = money /50;
//			money -= 50 * value7;
//			System.out.println("50원 : " + value7);
//		}if(money > 0) {
//			value8 = money /10;
//			money -= 10 * value8;
//			System.out.println("10원 : " + value8);
//		}else {
//			System.out.println("오류 발생");
//		}

