package ch03.for10;

import java.util.Scanner;

public class Resolve12 {

	public static void main(String[] args) {
		System.out.print("입력 >>> ");
		Scanner sc = new Scanner(System.in);
		int th = sc.nextInt();
		for (int i = 1; i <= th; i++) {
			System.out.println("감사합니다.");
		}
		sc.close();
	}
}