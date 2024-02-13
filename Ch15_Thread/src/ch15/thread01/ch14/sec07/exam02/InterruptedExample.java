package ch15.thread01.ch14.sec07.exam02;

public class InterruptedExample {
	public static void main(String[] args) {
		Thread Thread = new PrintThread();
		Thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		Thread.interrupt();;
	}
}
