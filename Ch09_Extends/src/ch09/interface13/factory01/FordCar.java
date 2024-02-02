package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class FordCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("Ford - The engine starts well. ~ F");
		Thread.sleep((long) Math.random() * 1000); // 0~1초사이로 잠깐 딜레이를 준다.
	}

	@Override
	public void trunOff() throws InterruptedException {
		System.out.println("Ford - It's easy to turn off the engine. ~ F");
		Thread.sleep((long) Math.random() * 1000);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("Ford - I'm a runaway ~ F");
		Thread.sleep((long) Math.random() * 1000);
	}

	@Override
	public void footBreak() throws InterruptedException {
		System.out.println("Ford - The brakes are good ~ F");
		Thread.sleep((long) Math.random() * 1000);
	}

}
