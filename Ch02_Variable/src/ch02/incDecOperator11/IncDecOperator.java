package ch02.incDecOperator11;

public class IncDecOperator {

	public static void main(String[] args) {
		int num = 0;
		num++;
		System.out.println(num);
		
		++num;
		System.out.println(num);
		
		// num의 값을 대입한 후 num이 1을 증가
		int result = num++;
		System.out.println("result " + result);
		System.out.println("num " + num);
		// num의 값을 바로 1증가
		result = ++num;
		System.out.println("result " + result);
		System.out.println("num " + num);
		
		num--;
		System.out.println("num = " + num);
	}

}
