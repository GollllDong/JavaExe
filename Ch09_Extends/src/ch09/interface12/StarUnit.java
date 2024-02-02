package ch09.interface12;

/* 인터페이스 == 추상클래스
 * 모든 메서드가 추상 메서드
 * 
 * 1) 상속을 전제로 한다.
 * 2) 부모의 인터페이스 변수에 자식 객체를 저장할 수 있다.
 * 3) 다형성의 의미(묶어서 관리하고 쉽고, 각 변수는 저장된 객체에 따라 각각 개성있게 동작) 
 * 4) 클래스와 클래스를 연결
 * 5) 유연한 설계
 * 6) 디자인 패턴에 자주 사용
 * 7) 리터럴 상수를 의미있는 문자열 상수로 만들어준다.
 * */

public interface StarUnit {
	public void walk();	// 컴파일할때 자동으로 abstract가 생략된다.
	public void attack();
	public void die();
}



//public abstract class StarUnit {
//	public abstract void walk();	// 컴파일할때 자동으로 abstract가 생략된다.
//	public abstract void attack();
//	public abstract void die();
//}
