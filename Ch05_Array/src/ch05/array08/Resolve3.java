package ch05.array08;

import java.util.Arrays;

public class Resolve3 {

	public static void main(String[] args) {
		//  정수 배열 5개를 할당하고
		// Sout(Arrays.toString(numArr));
		// 로 배열을 출력했을때 거꾸로 출력되도록 배열의 값을 거꾸로 저장.

		int[] numArr = {1,2,3,4,5}; 
		
		for(int i = 0; i < numArr.length; i++) {
			int tmp = numArr[i]; //   0번째 인덱스에 있는 1이 할당
			numArr[i] = numArr[(numArr.length-1)-i]; // numArr[0] = 4번째 인덱스에 위치한 5가 할당
			numArr[(numArr.length-1)-i] = tmp;	// 1을 numArr[0]에 할당
			System.out.println("tmp : "+tmp);
			System.out.println("num : " + numArr[i]);
			System.out.println("끝 인덱스"  +numArr[(numArr.length-1)-i]);
			
		}System.out.println(Arrays.toString(numArr));
		
//		for(int i = numArr.length-1; i >= 0; i--) {
//			for(int j = 0; j > numArr.length; j++) {
//				int tmp = numArr[j];
//				numArr[j] = numArr[i];
//			}
//			int tmp = numArr[i];
//			
//			System.out.println(Arrays.toString(numArr));
//			
//		}
	}

}
