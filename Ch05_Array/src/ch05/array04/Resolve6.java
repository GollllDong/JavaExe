package ch05.array04;

import java.util.Scanner;

public class Resolve6 {

	public static void main(String[] args) {
//		6. 5명의 학생의 이름과 점수를 입력받고
//		   해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
//		   A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
		
		String[] name = new String[5];
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < name.length; i++) {
			
			System.out.print((i+1)+"번째 학생 이름 >>> ");
			name[i] = sc.next();
			
			
			System.out.print("점수 입력 >>> ");
			score[i] = sc.nextInt();
			System.out.println("---------------");
		}
		for(int i = 0; i < score.length; i++) {
			if(score[i] >= 90) {
				System.out.println(name[i]+" 학생 A학점");
			}else if(score[i] >= 80) {
				System.out.println(name[i]+" 학생 B학점");
			}else if(score[i] >= 70) {
				System.out.println(name[i]+" 학생 C학점");
			}else if(score[i] >= 60) {
				System.out.println(name[i]+" 학생 D학점");
			}else {
				System.out.println(name[i]+" 학생 F학점");
			}
		}
		sc.close();
	}
}
