package ch05.array05.ch05.sec09;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyByForExample { // page 187 숫자는 0으로 초기화 문자열이나 문자는 null로 초기화

	public static void main(String[] args) {
		// 길이 3인 배열
		int[] oldIntArray = {1,2,3};
		// 길이 5인 배열
		int[] newIntArray = new int[5];
		
		// 배열 항목 복사
		for(int i=0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		// 배열 항목 출력
		for(int i=0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i]+", ");
		}
		System.out.println();
	}

}
