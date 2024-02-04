package ch09.resolve14.resolve2;

public class LG implements ITable {

	@Override
	public void movie() throws InterruptedException{
		System.out.println("LG movie Service start ~ L");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void music() throws InterruptedException{
		System.out.println("LG music Service start ~ L");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void readBook() throws InterruptedException{
		System.out.println("LG readBook Servie start ~ L");
		Thread.sleep((long)(Math.random()*500)+500);
	}	

}
