package ch03.continue11;

public class Resolve1 {

	public static void main(String[] args) { // p138 3번.
		System.out.println("3의 배수 총합 ");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
				System.out.println("sum : "+sum);
			}
		}
	}

}
