package ch03.control06;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		System.out.println("봄");
		System.out.println("여름");
		System.out.println("가을");
		System.out.println("겨울");
		System.out.print("선택 >>> ");
		
		Scanner sc = new Scanner(System.in);
		String sel = sc.nextLine();
		switch(sel) {
		case "봄" :
			System.out.println("애매하게 덥다.");
			break;
		case "여름" :
			System.out.println("산과 바다로 드가자");
			break;
		case "가을" :
			System.out.println("낙엽이 우수수 떨어진다.");
			break;
		case "겨울" :
			System.out.println("폐가 시렵다.");
			break;
		}
		
		sc.close();
	}
}
