package ch05.array08;

import java.util.Arrays;

public class Resolve2 {

	public static void main(String[] args) {
		int[] num = { 50, 10, 5, 60, 20 };
		int max = 0;
		int min = 0;

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int tmp = num[j];
					num[j] = num[i];
					num[i] = tmp;
				}

			}
			min = num[0];
			max = num[4];
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
