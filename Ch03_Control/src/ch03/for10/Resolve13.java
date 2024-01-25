package ch03.for10;

import java.util.Scanner;

public class Resolve13 {

	public static void main(String[] args) {
		System.out.println("입력 >>> ");
		Scanner sc = new Scanner(System.in);
		int th = sc.nextInt();
		for (int i = 1; i <= th; i++) {
			System.out.println(th +"의 배수 : " +th*i);
		}
		sc.close();
	}
}