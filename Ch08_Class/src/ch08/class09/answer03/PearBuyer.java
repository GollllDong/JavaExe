package ch08.class09.answer03;

public class PearBuyer {
	private int money;
	private int numOfPear;
	
	public PearBuyer(int money) {
		this.money = money;
		this.numOfPear = 0;
	}
	public void buyPear(PearSeller seller, int money) {
		this.numOfPear = seller.salePear(money);
		this.money -= money;
	}
	public void showButResult() {
		System.out.println("*** 배 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("배 개수 : " + numOfPear);
	}
}

// 다시 해
//import ch08.pratice02.PearSeller;
//
//public class PearBuyer {
//	private int money;
//	private int numOfPear;
//
//	public PearBuyer(int money) {
//		this.money = money;
//		this.numOfPear = 0;
//	}
//
//	public void buyPear(PearSeller seller, int value) {
//		if (value <= seller.pearNum && this.money >= value * seller.saleMoney) {
//			this.numOfPear += value;
//			int result = (value * seller.saleMoney);
//			this.money -= result;
//			seller.pearNum -= value;
//			showBuyer();
//		} else {
//			System.out.println("잔액이 부족합니다.");
//		}
//
//	}
//
//	public void showBuyer() {
//		System.out.println("구매자의 잔액 : " + money);
//		System.out.println("구매한 배 개수 : " + numOfPear);
//	}
//}
