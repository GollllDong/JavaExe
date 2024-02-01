package ch08.class03;

/* static 메서드는 객체를 만들지 않아도 바로 사용이 가능하다. (클래스 메서드)
 * 
 * */

public class ArithEx {
	public static void main(String[] args) {
		int a = 10, b = 5;
		int result = 0;
		// 클래스 메소드로 바로 호출이 가능함.
		result = Arith.add(a, b);
		System.out.println(result);
		
		result = Arith.sub(a, b);
		System.out.println(result);
		
		result = Arith.mul(a, b);
		System.out.println(result);
		
		result = Arith.div(a, b);
		System.out.println(result);
		
		// 이렇게 해주면 인스턴스 메소드 방식으로 하게 되고
		// 객체를 생성해줘서 사용한다. 클래스 메소드를 사용하는것보다 메모리에 올라가는 속도는 느리다.
		Arith arith = new Arith(10, 5); 
		System.out.println(arith.add_2());
	}
}
