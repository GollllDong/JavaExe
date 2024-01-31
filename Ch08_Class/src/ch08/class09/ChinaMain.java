package ch08.class09;

import java.util.Scanner;

public class ChinaMain {

	public static void main(String[] args) {
		//중화요리집을 임의대로 클래스로 만드세요
		Scanner sc = new Scanner(System.in);
		China china = new China();
		
		china.sc = sc;
		china.store_menu();
		china.store_choice();
		
		sc.close();
	}

}
