package ch17.stream01;

import java.util.Arrays;

public class StreamReduce {
	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		/* 배열의 총합을 구하는 수식
		*  2개의 인자를 받아서 1개를 리턴해준다.		 초기값 2개의 인자값
		*  모든 스트림을 순환
		*  a=1, b=2 => 3
		*  a=3, b=3 => 6
		*  a=6> b=4 => 10
		*  ...
				*/
		
		/* 앞의 연산의 결과가 다시 a로 입력되고
		 * 새로운 배열의 인자가 b로 입력되어
		 * 계속 반복 연산이 진행된다.
		 * */
		
		/* reduce의 로직은 우리가 직접 구성한다.
		 * 
		 * */
		int sum = Arrays.stream(numArr).reduce(0, (a,b) -> a+b);
		System.out.println("sum = " + sum);
		
		String[] arr = {"안녕하세요!!!", "hello", "Good morning", "반갑습니다^^"};
		String result = Arrays.stream(arr).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length) {
				// 영어와 한글의 byte수는 달라서 안녕하세요!!!가 제일 크다고 나온다.
				// 한글은 한글자에 3byte를 차지한다. 영문은 1byte
				return s1;
			}else {
				return s2;
			}
		});
		System.out.println("메모미를 가장 많이 차지하는 인사말은 "+result);
		
//		Arrays.stream(strArr) 
//				.mapToInt(s->s.getBytes().length);
//				.forEach(s -> System.out.println(s))
	}
}
