package ch05.array04;

import java.util.Arrays;
import java.util.Scanner;

public class Resolve5 {

	public static void main(String[] args) {
		// 5. int배열을 10개 생성하세요.
		// 사용자로부터 10개의 값을 입력받고
		// 순서대로 출력하고 총합을 구하세요
		int[] value = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i <= value.length - 1; i++) {
			System.out.print((i + 1) + "번쨰 " + "값 입력 >>> ");

			value[i] = sc.nextInt();
			sum += value[i];
		}
		System.out.println(Arrays.toString(value));
		System.out.println("총합 : " + sum);
		sc.close();
	}
}
