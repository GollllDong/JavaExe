package ch09.resolve14.resolve1;

public class LazerPrinter extends Printer{
	private int tonerRemain;
	private int repetition;

	public LazerPrinter(String modelName, String manufacturer, String interfaceType, int printNum, int amountPaper, int tonerRemain, int repetition) {
		super(modelName, manufacturer, interfaceType, printNum, amountPaper);
		this.tonerRemain = tonerRemain;
		this.repetition = repetition;
	}

	
	@Override
	public void print() {
		if(this.amountPaper < 0 || this.tonerRemain < 0) {
			System.out.println("작업을 수행하기 위한 토너나 종이가 부족합니다.");
		}
		for(int i = 1; i<= this.repetition; i++) {
			System.out.println("LazerPrinter의 모델명 : " + this.modelName);
			System.out.println("LazerPrinter의 제조사 : " + this.manufacturer);
			System.out.println("LazerPrinter의 인터페이스 종류 : " + this.interfaceType);
			System.out.println("LazerPrinter의 현재 인쇄 매수 : " + this.printNum);
			System.out.println("LazerPrinter의 남은 인쇄 종이 : " + this.amountPaper);
			System.out.println("LazerPrinter의 토너 잔량 : " + this.tonerRemain);
			--this.amountPaper;
			++this.printNum;
			--this.tonerRemain;
			System.out.println("------------------------------");
		}
	}
}
