package ch03.for10;

import java.util.Scanner;

public class Resolve14 {

	public static void main(String[] args) {
		System.out.println("구구단의 출력하고 싶은 단 입력 >>> ");
		Scanner sc = new Scanner(System.in);
		int th = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(th +" * "+i +" = "+ +th*i);
		}
		sc.close();
	}
}