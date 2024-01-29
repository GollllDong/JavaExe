package ch05.array08;

import java.util.Arrays;

public class Resolve1 {

	public static void main(String[] args) {
		int[] num = {95, 80, 25, 60, 50};

		System.out.println("정렬 전 : "+Arrays.toString(num));
		Arrays.sort(num);
		System.out.println("정렬 후 : "+Arrays.toString(num));
		int max = num[4];
		int min = num[0];	// num[num.length-1]도 가능하다.
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
		

	}

}
