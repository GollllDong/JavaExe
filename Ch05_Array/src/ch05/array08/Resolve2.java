package ch05.array08;

import java.util.Arrays;

public class Resolve2 {

	public static void main(String[] args) {
		int[] num = {75, 20, 55, 62, 92};
		int max = 0;
		int min = 0;

		for(int i = 0; i < num.length-1; i++) {
			if(num[i] > num[i+1]) {
				int tmp = num[i];
				num[i] = num[i+1];
				num[i+1] = tmp;
				System.out.println(Arrays.toString(num));
				max = num[4];
				min = num[0];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
