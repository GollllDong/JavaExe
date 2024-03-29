package ch16.lambda02.sec04;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		// 매개변수가 2개일 경우
		person.action((x, y) -> {
			double result = x+y;
			return result;
		});
		// 리턴문이 하나만 있을 경우(연산식)
		// person.action(x,y 0> {
		// return (x+y);
		// });
		person.action((x,y) -> (x+y));
		
		// 리턴문이 하나만 있을 경우(메소드 호출)
		// Person.action((x,y) -> {
		// return sum(x,y);
		// });
		person.action((x,y) -> sum(x,y));
}

	private static double sum(double x, double y) {
		return (x+y);
	}
}