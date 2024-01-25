package ch03.dowhile09;

public class DoWhileEx {

	public static void main(String[] args) {
		int i = 1;
		do { // do while문은 조건이 false여도 무조건 한번은 실행한다.
			System.out.println(i);	// 실행 
			i++;					// 증감
		}while(i<=10);				// 조
	}

}
