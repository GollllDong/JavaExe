package ch09.extends04;

public class Child extends Father {
	
	float day = 365 + 1.0f / 4;
	
	Child() {
		System.out.println("Child 생성자"); 
	}
	
	Child(int score, long money, float day) {
		// 위의 부모의 매개변수 생성자를 호출해준다.
		super(score, money); {
		this.day = day;
		System.out.println("Child 매개변수 생성자");
		}
	}
	
	void play() {
		System.out.println("인생이 즐겁다!!");
	}
	

}
