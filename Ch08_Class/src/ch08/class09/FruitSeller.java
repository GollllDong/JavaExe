package ch08.class09;

public class FruitSeller {
	private int numOfApple; // 사과개수
	private int saleMoney; // 판매금액
	final int APPLE_PRICE = 1000; // 사과가격(상수), 프로그램의 안전을 위해 값을 고정상태로 둔다.
	
	public FruitSeller(int numOfApple) {
		this.numOfApple = numOfApple; // this를 안붙여주면 지역변수가 아닌 매개변수에 값이 들어가게 된다.
		
	}
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		saleMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfApple); 	// 매개변수의 값으로 numOfApple과 같은 변수가 없으니까 클래스의 지역변수의 값이 넘어온다.
		System.out.println("판매 수익 : " + saleMoney);
	}

}
