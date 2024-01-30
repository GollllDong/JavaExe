package ch06.method01;

import java.util.Scanner;

public class Resolve4 {

	public static void gugudan(int tmp) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(tmp + "*" + i + "=" + tmp*i);
		}
	}

	public static void main(String[] args) {
//		gugudan(3);
//		   
//		   구구단 메서드를 void 리턴형으로 제작하세요.
//		  3을 입력하면 3단이 출력됩니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단 입력 : ");
		int tmp = sc.nextInt();
		

		gugudan(tmp);
		sc.close();
	}

}
