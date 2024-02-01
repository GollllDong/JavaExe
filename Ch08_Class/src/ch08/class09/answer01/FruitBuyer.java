package ch08.class09.answer01;

public class FruitBuyer {
	private int money;
	private int numOfApple;
	final int APPLE_PRICE = 1000; // 사과가격(상수), 프로그램의 안전을 위해 값을 고정상태로 둔다.	
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;
	}
	public int buyApple(int money) {
		int num = money/APPLE_PRICE;
		this.numOfApple += num;
		this.money -= money;
		return num;
	}
	public void showButResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개수 : " + numOfApple);
	}
}
