package ch05.array04;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		// 3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
		int[] value = new int[7];
		int sum = 0;
		int total = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= value.length; i++) {			
			System.out.print("학점 입력 >>> ");
			sum += sc.nextInt();
		}
		total = sum;
		avg = (double)total/value.length;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

		sc.close();
	}

}
