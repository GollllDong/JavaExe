package ch05.array08;

import java.util.Arrays;

public class Resolve4 {

	public static void main(String[] args) {
		// 정수 배열 5개를 할당하고
//		   Arrays.sort를 사용하지 말고
//		   배열을 오름차순으로 정렬하도록 저장하세요.
//		   그리고 출력하세요.

		int[] numArr = {9, 6, 1, 2, 5};
		
		for(int i = 0; i < numArr.length-1; i++) {
			for(int j = i+1; j < numArr.length; j++) {
				if(numArr[i] > numArr[j]) {
					int tmp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(numArr));
	}

}
