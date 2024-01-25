package ch03.while08;

public class Resolve3 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i < 10) {
			i++;
			sum += i;
		}
		System.out.println("1~10의 총합 : " + sum);
	}
}
