package ch15.thread01.ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeppPrintExample {
	public static void main(String[] args) {
		// 메인 스레드가 Worker 스레드 생성 후 -> start() -> run() 실행
		// 메인 스레드가 띵, worker 스레드는 비프음
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					}catch(Exception e) { }
				}
			}
		});
		thread.start();
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
