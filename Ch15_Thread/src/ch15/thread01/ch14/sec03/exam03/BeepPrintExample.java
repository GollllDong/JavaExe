package ch15.thread01.ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {

	// main메소드는 main스레드가 해야할 일
	public static void main(String[] args) {
		// main스레드(주인 아저씨) 가 work스레드(알바생)을 고용하낟.
		Thread thread = new Thread() {
			
			// 알바생이 해야할 일
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
				}try {Thread.sleep(500); } catch(Exception e) {}
			}
		};
		// worker스레드(알바생) 일 시작해라.
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
