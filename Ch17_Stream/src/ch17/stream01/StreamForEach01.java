package ch17.stream01;

import java.util.Arrays;

public class StreamForEach01 {

	public static void main(String[] args) {
		int[] arr = { 10, 30, 99, 2, 77, 3 };

		// 1) 출력하는 법
		System.out.println(Arrays.toString(arr));

		// 2) 출력하는 법
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();

		// 3) 출력하는 법
		for (int e : arr) {
			System.out.print(e + ", ");
		}
		System.out.println();

		// 4) 스트림 사용(스트림 객체 -> 최종연산) , 내부에서 연산이 되서 출력이 된다. 코드양을 줄일 수 있다.
		// 스트림 = 데이터들을 꺼낼 수 있게 줄 세워놓기, 한 방향성이 있고 한방향으로 흐른다.
		// 1) 스트림 객체 생성, 2) 중간연산(데이터를 가공(filter, map)), 3) 최종연산(결과값(for Each, count, sum등등))
		Arrays.stream(arr).forEach(n -> System.out.print(n + ","));
	}

}
