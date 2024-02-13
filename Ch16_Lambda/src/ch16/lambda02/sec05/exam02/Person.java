package ch16.lambda02.sec05.exam02;

public class Person {
	public void ordering(Comparable calcuable) {
		String a = "홍길동";
		String b = "김길동";

		int result = calcuable.compare(a, b);
		
		if(result < 0) {
			System.out.println(a + "은 " + b + "보다 앞에 옵니다.");
		} else if(result == 0) {
			System.out.println(a + "은 " + b + "와 같습니다.");
		} else {
			System.out.println(a + "은 " + b + "보다 뒤에 옵니다.");
		}
	}

	public void ordering(Object object) {
		// TODO Auto-generated method stub
		
	}
}