package ch05.array05.ch05.sec09;

import java.util.Arrays;
import java.util.Scanner;

public class AdcancesForExample {

	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		int[] scores = {95, 71, 84, 93, 87};
		// 배열 항목 전체 합 구하기
		int sum = 0;
		// for each문 -> 다른 조건없이 해당 for문안에 있는 값들을 처음부터 끝까지 반복
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 : "+sum);
		//배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}
