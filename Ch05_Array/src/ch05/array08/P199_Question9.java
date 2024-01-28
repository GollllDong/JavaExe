package ch05.array08;

import java.util.Arrays;
import java.util.Scanner;

public class P199_Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student_count = 0;
		int[] score = new int[3];
		int max = 0;
		int total = 0;
		float avg = 0.0f;
		
		while(true) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택 > ");
			int choice_menu = sc.nextInt();
			
			if(choice_menu == 1) {
				System.out.print("학생 수 > ");
				int tmp = sc.nextInt();
				student_count = tmp;
				System.out.println("학생 수 : "+student_count + "명");

			}
			else if(choice_menu == 2) {
				System.out.println("점수 입력 >> ");
				for(int i = 0; i < score.length; i++) {
					System.out.printf("Scores[%d] >", i );
					score[i] = sc.nextInt();

				}
			}
			else if(choice_menu == 3) {
				for(int i = 0; i < score.length; i++) {
					System.out.printf("Scores[%d] : %d%n", i, score[i]);

				}
			}
			else if(choice_menu == 4) {
				Arrays.sort(score);
				max = score[2];
				System.out.println("최고 점수 : "+max);
				
				for(int i = 0; i < score.length; i++) {
					total += score[i];
				}
				avg = (float)total / score.length;
				System.out.printf("평균 점수 : %.2f%n", avg);
			}
			else if(choice_menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
		}

	}
}

