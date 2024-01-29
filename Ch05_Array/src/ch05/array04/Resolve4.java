package ch05.array04;

public class Resolve4 {

	public static void main(String[] args) {
		// 4. int배열을 10개 생성하세요.
		// int배열에 3의 배수를 차례대로 저장하세요.
		// 그리고 거꾸로 출력하세요.
		int[] value = new int[10];
		for (int i = 0; i < value.length; i++) {
			value[i] = 3 * (i + 1);
		}
		for (int j = value.length - 1; j >= 0; j--) {
			System.out.println((j + 1) + "번째 값 : " + value[j]);
		}
	}
}
