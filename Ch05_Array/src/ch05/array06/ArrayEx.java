package ch05.array06;

import java.util.Arrays;
import java.util.Scanner;

// 배열의 얕은 복사 / 깊은 복사
public class ArrayEx {
	public static void main(String[] args) {
		int[] scores = {100, 88, 95, 67, 75};
		int[] scores1 = scores;
		int[] scores2 = scores1;
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		System.out.println(scores); // 해시코드 출력
		System.out.println(scores1); 
		System.out.println(scores2); // 참조변수를 복사했기 때문에 해시코드의 주소까지 똑같다.
		
		System.out.println();
		
		// 얕은 복사
		scores[2] = 99;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		System.out.println(scores); // 
		System.out.println(scores1); 
		System.out.println(scores2); // 
		
		//깊은 복사 (힙에 별도의 공간을 생성한 후 scores4는
		// 		 새로 생성한 공간을 가리키게 된다.
		// ; 기존 공간과 분리되는 공간이다.
		int[] scores4 = Arrays.copyOf(scores, scores1.length);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores4));
		System.out.println();
		
		scores[2] = 11111111;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		System.out.println(Arrays.toString(scores4));
	}

}
