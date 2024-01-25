package ch03.for10;


public class Resolve1 {

	public static void main(String[] args) {
		int money = 78670;
		int value1 = 0;
		int value2 = 0;
		int value3 = 0;
		int value4 = 0;
		int value5 = 0;
		int value6 = 0;
		int value7 = 0;
		int value8 = 0;
		
		while(money ==0) {
			
		}
		if(money > 0) {
			value1 = money / 50000;
			money -= 50000*value1;
			System.out.println("5만원 : " + value1);
		}if(money > 0) {
			value2 = money /10000;
			money -= 10000 * value2;
			System.out.println("1만원 : " + value2);
		}if(money > 0) {
			value3 = money /5000;
			money -= 5000 * value3;
			System.out.println("5000원 : " + value3);
		}if(money > 0) {
			value4 = money /1000;
			money -= 1000 * value4;
			System.out.println("1000원 : " + value4);
		}if(money > 0) {
			value5 = money /500;
			money -= 500 * value5;
			System.out.println("500원 : " + value5);
		}if(money > 0) {
			value6 = money /100;
			money -= 100 * value6;
			System.out.println("100원 : " + value6);
		}if(money > 0) {
			value7 = money /50;
			money -= 50 * value7;
			System.out.println("50원 : " + value7);
		}if(money > 0) {
			value8 = money /10;
			money -= 10 * value8;
			System.out.println("10원 : " + value8);
		}else {
			System.out.println("오류 발생");
		}
		
	}

}
