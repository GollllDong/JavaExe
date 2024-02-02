package ch09.interface12;

public class Marine implements StarUnit { // 구현한다(사실상 상속)

	@Override
	public void walk() {
		System.out.println("아장아장");
	}

	@Override
	public void attack() {
		System.out.println("두두두두");
	}

	@Override
	public void die() {
		System.out.println("으아아악");
	}
	
}
