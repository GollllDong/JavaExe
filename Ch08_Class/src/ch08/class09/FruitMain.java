package ch08.class09;

import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		Scanner sc = null;
		
		FruitSeller seller = new FruitSeller(20, sc);
		FruitBuyer buyer = new FruitBuyer(10000);
		
		seller.Refund();
		
		buyer.showButResult();
		
		buyer.buyApple(seller, 2000);
//		seller.saleApple(buyer, 2000);
		
		
		seller.showSaleResult();
		buyer.showButResult();

	}

}
