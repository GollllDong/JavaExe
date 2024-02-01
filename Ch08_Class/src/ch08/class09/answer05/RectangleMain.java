package ch08.class09.answer05;

import java.util.Scanner;

public class RectangleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		
		System.out.println("x1 좌표 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("x2 좌표 입력 : " );
		int num2 = sc.nextInt();
		System.out.println("y1 좌표 입력 : ");
		int num3 = sc.nextInt();
		System.out.println("y2 좌표 입력 : ");
		int num4 = sc.nextInt();
		
		r1.set(num1, num2, num3, num4);
		r1.square();
		r1.show();
		r1.equals(r1);
		
		Rectangle r2 = new Rectangle();
		
		r2.set(5, 2, 9, 2);
		
		r2.square();
		r2.show();
		System.out.println(r1.equals(r2));
		sc.close();
	}
}
