package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class LgTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("LgTablet - 영화 화질 좋다 ~ H");
		Thread.sleep((long) (Math.random() * 500) + 500); // 0~1초사이로 잠깐 딜레이를 준다.

	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("LgTablet - 음질이 생각보다 좋다 ~ H");
		Thread.sleep((long) (Math.random() * 500) + 500); // 0~1초사이로 잠깐 딜레이를 준다.

	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LgTablet - 책읽는데 눈이 안아프다 ~ H");
		Thread.sleep((long) (Math.random() * 500) + 500); // 0~1초사이로 잠깐 딜레이를 준다.

	}

}
