package ch03.for10;

import java.util.Scanner;

public class Resolve15 {

	public static void main(String[] args) {
		boolean value = false;
		int sum = 0;
		while(value = true) {
			System.out.print("입력(0 입력시 합산 결과 출력) >>> ");
			Scanner sc = new Scanner(System.in);
			int in = sc.nextInt();
			sum += in;
			if (in == 0) {
				value = true;
				break;
			}
			
		}
		System.out.println(sum);
	}
}