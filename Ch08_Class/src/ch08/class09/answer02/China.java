package ch08.class09.answer02;

import java.util.Arrays;
import java.util.Scanner;

public class China {
//	중화요리집을 임의대로 클래스로 만드세요
	private String[] store = { "홍콩반점", "보배반점", "만리장성" };
	private int selectNum;
	public Scanner sc;
	public String result;

	public void store_menu() { // 가게 메뉴 보여줌
		for (int i = 0; i < store.length; i++) {
			result = (i + 1) + "번째 가게 : " + store[i];
			System.out.println(result);
		}
	}
	public void store_choice() {
		System.out.print("가게를 선택해주세요 >>> ");
		selectNum = sc.nextInt();
		if (selectNum == 1 ) {
			hongkong();
		}else if (selectNum == 2) {
			bobae();
		}else if(selectNum == 3) {
			manli();
		}
	}

	public void hongkong() {
		System.out.println("-----------------");
		System.out.println("어서오세요 " + store[0] + " 입니다.");
		System.out.println("-----------------");
		String[] foods = {"짜장면", "짬뽕", "고추짜장", "고추짬뽕"};
		System.out.println();
		System.out.println("메뉴 1) 짜장면 2) 짬뽕 3) 고추짜장 4) 고추짬뽕");
		System.out.print("메뉴를 골라주세요 >>> ");
		int menu_choice = sc.nextInt();
		System.out.println("주문하신 " + foods[menu_choice-1] + " 메뉴가 나왔습니다!");
	}

	public void bobae() {
		System.out.println("-----------------");
		System.out.println("어서오세요 " + store[1] + " 입니다.");
		System.out.println("-----------------");
		String[] foods = {"고추짜장", "삼선짬뽕", "우동", "소고기짬뽕"};
		System.out.println("메뉴 1) 고추짜장 2) 삼선짬뽕 3) 우동 4) 소고기짬뽕");
		System.out.print("메뉴를 골라주세요 >>> ");
		int menu_choice = sc.nextInt();
		System.out.println("주문하신 " + foods[menu_choice-1] + " 메뉴가 나왔습니다!");
	}

	public void manli() {
		System.out.println("-----------------");
		System.out.println("어서오세요 " + store[2] + " 입니다.");
		System.out.println("-----------------");
		String[] foods = {"탕수육", "유린기", "너비아니", "베이징덕"};
		System.out.println("메뉴 1) 탕수육 2) 유린기 3) 너비아니 4) 베이징덕");
		System.out.print("메뉴를 골라주세요 >>> ");
		int menu_choice = sc.nextInt();
		System.out.println("주문하신 " + foods[menu_choice-1] + " 메뉴가 나왔습니다!");
	}

//	public void selectFood() {
//		System.out.println("---[" + name + "]---");
//		System.out.println("어떤 음식을 선택하시겠습니가? >> ");
//		selectNum = sc.nextInt();
//	}

//	China(String name, String menu) {
//		this.name = name;
//		this.menu = menu;
//	}

//	public static void HokongBanJeom(String name, String menu) {
//		System.out.printf("가게 이름 : %s %n메뉴 : %s", name, menu);
//	}
//	public static void BoBaeBanJeom(String name, String menu) {
//		System.out.printf("가게 이름 : %s %n메뉴 : %s", name, menu);
//	}
}
