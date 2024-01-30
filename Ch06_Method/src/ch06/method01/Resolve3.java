package ch06.method01;

public class Resolve3 {

	static int total(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
//		int result = total(10, 100);
//		위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
//		total메서드를 작성하고 사용해보세요.

		int result = total(10, 100);
		System.out.println(result);

	}

}
