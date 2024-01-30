package ch08.class07;

import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Restaurant rest = new Restaurant(sc, "새마을 식당", new String[]{"연탄불고기", "소금구이", "차돌박이"}) ;
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		
		Restaurant rest1 = new Restaurant(sc, "낙원타코", new String[]{"낙원파히타", "김치브리또", "불고기퀘사디아"});
		rest1.viewMenu();
		rest1.selectFood();
		rest1.deliveryFood();
		
		Restaurant rest2 = new Restaurant(sc, "BBQ", new String[]{"황금올리브", "핫크리스피", "자메이카"});
		rest2.viewMenu();
		rest2.selectFood();
		rest2.deliveryFood();
	}

}
