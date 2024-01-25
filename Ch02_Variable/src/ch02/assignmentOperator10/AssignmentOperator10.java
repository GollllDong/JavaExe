package ch02.assignmentOperator10;

public class AssignmentOperator10 {

	public static void main(String[] args) {
		int num = 0;
		/*
		 * 변수는 보통 자료형 오른쪽에 위치하고 저장공간이라는 의미를 가진다.
		 * 오른쪽에서는 변수(공간)에 들어있는 값의 의미를 갖는다.
		 * = 는 오른쪽(값) -> 왼쪽(변수)에 저장
		 * */
		num += 10;
		System.out.println(num);
		num += 20;
		System.out.println(num);

	}

}
