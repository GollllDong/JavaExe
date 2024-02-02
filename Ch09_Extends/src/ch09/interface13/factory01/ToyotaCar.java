package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class ToyotaCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("ToyotaCar - エンジンがよくかかる ~ T");
		Thread.sleep((long) Math.random() * 1000); // 0~1초사이로 잠깐 딜레이를 준다.
	}

	@Override
	public void trunOff() throws InterruptedException {
		System.out.println("ToyotaCar - エンジンがよく切れる ~ T");
		Thread.sleep((long) Math.random() * 1000);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("ToyotaCar - エクセルがよく押される ~ T");
		Thread.sleep((long) Math.random() * 1000);
	}

	@Override
	public void footBreak() throws InterruptedException {
		System.out.println("ToyotaCar - ブレーキが柔らかい ~ T");
		Thread.sleep((long) Math.random() * 1000);
	}

}
