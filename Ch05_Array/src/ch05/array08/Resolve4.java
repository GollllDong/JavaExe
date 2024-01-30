package ch05.array08;

import java.util.Arrays;

public class Resolve4 {

	public static void main(String[] args) {
		// 정수 배열 5개를 할당하고
//		   Arrays.sort를 사용하지 말고
//		   배열을 오름차순으로 정렬하도록 저장하세요.
//		   그리고 출력하세요.
		
		// 난수 사용
//		int[] new_numArr = new int[10000];
//		
//		for(int a =0; a < new_numArr.length; a++) {
//			double dval = Math.random();
//			new_numArr[a] = (int)(dval * 10000);
//		}System.out.print(Arrays.toString(new_numArr));

		int[] numArr = {9, 6, 1, 2, 5};
		
		// 선택 정렬
//		for(int i = 0; i < numArr.length; i++) {
//			// i번째 데이터를 선택한다.
//			// i를 최소값으로 가정한다.
//			int sel = numArr[i];
//			int minIdx = i;
//			// i 다음부터 마지막까지 반복 
//			for(int j = i+1; j<numArr.length; j++) {
//				// 현재 선택한 데이터보다 작은 값이 나타나
//				if(sel > numArr[j]) {
//				// 선택한 것을 교체한다.
//					minIdx = j;
//					sel = numArr[j];
//				}
//			}
//			
//			int temp = numArr[i];
//			numArr[i] = numArr[minIdx];
//		}System.out.println(Arrays.toString(numArr));
		
		
		// 버블 정렬
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
