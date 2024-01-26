package ch03.continue11;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		int account = 0;
		while(true) {
			
			int value1 = 0;
			int value2 = 0;
			int value3 = 0;
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			
			System.out.println("선택 > ");
			Scanner sc = new Scanner(System.in);
			String value = sc.nextLine();
			
			
			if(value.equals("1")) {
				System.out.println("예금기능");
				System.out.println("예금액 : ");
				value1= sc.nextInt();
				account += value1;
			}else if (value.equals("2")) {
				System.out.println("출금기능");
				System.out.println("출금액 : ");
				value2= sc.nextInt();
				account -= value2;
			}
			else if (value.equals("3")) {
				System.out.println("잔고확인");
				System.out.println(account);
			}
			else if (value.equals("4")) {
				System.out.println("종료");
				System.out.println(account);
			}
			
		}
		

	}

}
