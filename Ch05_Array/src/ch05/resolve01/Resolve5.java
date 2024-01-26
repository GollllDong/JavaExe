package ch05.resolve01;

import java.util.Scanner;

public class Resolve5 {

	public static void main(String[] args) {
		// 5. int배열을 10개 생성하세요.
		//	 사용자로부터 10개의 값을 입력받고
		//	순서대로 출력하고  총합을 구하세요
		int[] value = new int[10];
		int sum = 0;
		for(int i = 0; i <= value.length-1; i++) {
			System.out.println("값 입력 >>> ");
			
			Scanner sc = new Scanner(System.in);
			value[i] = sc.nextInt();
			System.out.println(i +"번째 값 : "+ value[i]);
			sum += value[i];
		}System.out.println("총합 : " + sum);
	}
}
