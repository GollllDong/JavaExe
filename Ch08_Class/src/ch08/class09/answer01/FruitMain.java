package ch08.class09.answer01;

import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		Scanner sc = null;
		
		FruitSeller seller = new FruitSeller(20);
		FruitBuyer buyer = new FruitBuyer(10000);

		buyer.showButResult();
		
		buyer.buyApple(2000);
//		seller.saleApple(buyer, 2000);
		
		
		seller.showSaleResult();
		buyer.showButResult();

	}

}
