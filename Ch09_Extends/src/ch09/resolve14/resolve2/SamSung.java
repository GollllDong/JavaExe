package ch09.resolve14.resolve2;

public class SamSung implements ITable {

	@Override
	public void movie() throws InterruptedException{
		System.out.println("SamSung movie Service start ~ S");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void music() throws InterruptedException{
		System.out.println("SamSung music Service start ~ S");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void readBook() throws InterruptedException{
		System.out.println("SamSung readBook Servie start ~ S");
		Thread.sleep((long)(Math.random()*500)+500);
	}	

}
