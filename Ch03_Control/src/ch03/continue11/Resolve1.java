package ch03.continue11;

public class Resolve1 {

	public static void main(String[] args) { // p138 3번.
		System.out.println("3의 배수 총합 ");
		int sum = 0;  //sum이 스택에 올라가게 된다. 메인 메서드에 지역변수. -> main메서드가 끝날때까지 존재하게 됨.
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ", ");
				sum += i;	//for문을 수행하게 되고 main메서드의 매개변수인 sum에 값을 넘겨준다.
			}
		}
		System.out.println();
		System.out.println("sum : "+sum);
	}

}
