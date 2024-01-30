package ch08.class05;

public class HumanMain {

	public static void viewInfo(Human human) { // 클래스에 대한 객체를 매개변수의 값으로 받아온다.(human은 해당 메소드에 대한 지역변수)
		System.out.println("이름 : " + human.name);
		System.out.println("나이 : " + human.age);
		System.out.println("학점 : " + human.score);
	}
	
	public static void main(String[] args) {
		Human human = new Human();
		human.name = "홍길동";
		human.age = 24;
		human.score = 4.5;
		
		viewInfo(human);
		
		/* 중간에 많은 처리/연산이 있었다.
		 * 그러다 age나 score값의 음수가 들어갔다.
		 * */
		human.age = -10;
		human.score = -10;
		human.age = -10;
	}
}
