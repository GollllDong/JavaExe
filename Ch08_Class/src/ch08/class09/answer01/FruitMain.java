package ch08.class09.answer01;

public class FruitMain {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20);
		FruitBuyer buyer = new FruitBuyer(10000);

		buyer.showBuyResult();

		buyer.buyApple(2000);
		seller.saleApple(buyer, 2000);

		seller.showSaleResult();
		buyer.showBuyResult();

	}

}
//
//public class FruitMain {
//
//	public static void main(String[] args) {
//		FruitSeller seller = new FruitSeller(20);
//		FruitBuyer buyer = new FruitBuyer(10000);
//
//		buyer.showBuyResult();
//		
//		buyer.buyApple(2000);
//		seller.saleApple(buyer, 2000);
//		
//		
//		seller.showSaleResult();
//		buyer.showBuyResult();
//
//	}
//
//}
