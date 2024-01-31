package ch08.class09;

public class Mart {
	private int money = 5000;
	private int peer = 2500;
	private int result = 0;
	private int buy_peer = 0;
	
	public int buy() {
		System.out.println("배 가격은 2500원 입니다.");
		result = money - peer;
		peer += 1;
		System.out.println("남은 잔액 >>> " + result);
//		System.out.println("구매 배 갯수 >>> " + buy_peer);
		return result;
	}
}