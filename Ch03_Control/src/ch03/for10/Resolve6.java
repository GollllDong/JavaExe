package ch03.for10;

public class Resolve6 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		do {
			System.out.println(i + sum);
			i++;
			sum += i;
		}while(i < 10);
		System.out.println("sum :" + sum);
	}

}
