package ch03.continue11;

public class Resolve2 {

	public static void main(String[] args) { // p139 6번
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
