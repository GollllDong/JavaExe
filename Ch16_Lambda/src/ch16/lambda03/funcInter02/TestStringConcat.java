package ch16.lambda03.funcInter02;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";

		// 인터페이스 상속 구현 클래스를 사용해서 출력 
		StringConcat concat1 = new StringConcatImplement();
		concat1.makeString(s1, s2);

		// 람다식으로 구현, 추상 메서드가 하나만 있기 때문에 컴파일러가 자동으로 넘겨준다. 함수형 프로그래밍이기 때문에 한번에 처리할려고 한다.
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);

		// 익명 객체로 구현
		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			};
		};
		concat3.makeString(s1, s2);

		// 익명 객체 사용
		showMakeString(new StringConcat() {
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			};
		});

		StringConcat concat4 = (s, v) -> System.out.println(s + "," + v);
		showMakeString(concat4);

		showMakeString((s, v) -> System.out.println(s + "," + v));
	}

	public static void showMakeString(StringConcat concat) {
		concat.makeString("헬로", "월");
	}
}
