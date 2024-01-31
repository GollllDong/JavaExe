package ch09.resolve07;

import java.util.Scanner;


class Add {
	private int a,b;
	public void setValue(int num1, int num2) {
		this.a = num1;
		this.b = num2;
	}
	public int calculate() {
		return a + b;
	}
}
class Sub {
	private int a,b;
	public void setValue(int num1, int num2) {
		this.a = num1;
		this.b = num2;
	}
	public int calculate() {
		return a - b;
	}
}
class Mul {
	private int a,b;
	public void setValue(int num1, int num2) {
		this.a = num1;
		this.b = num2;
	}
	public int calculate() {
		return a * b;
	}
}
class Div {
	private int a,b;
	public void setValue(int num1, int num2) {
		this.a = num1;
		this.b = num2;
	}
	public int calculate() {
		return a / b;
	}
}


public class Resolve1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번째 값 입력 >>> ");
		int num1 = sc.nextInt();
		System.out.println("2번째 값 입력 >>> ");
		int num2 = sc.nextInt();
		System.out.println("[+, -, *, /] 중에서 하나를 골라주세요 >>>");
		String s = sc.next();
		
		if(s.equals("+")) {
			Add add = new Add();
			add.setValue(num1, num2);
			int result = add.calculate();
			System.out.println(result);
		}
		else if(s.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(num1, num2);
			int result = sub.calculate();
			System.out.println(result);
		} 
		else if (s.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(num1, num2);
			int result = mul.calculate();
			System.out.println(result);
		}
		else if(s.equals("/")) {
			Div div = new Div();
			div.setValue(num1, num2);
			int result = div.calculate();
			System.out.println(result);
		}else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
	}

}
