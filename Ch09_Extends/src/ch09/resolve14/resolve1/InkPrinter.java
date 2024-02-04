package ch09.resolve14.resolve1;

public class InkPrinter extends Printer {

	private int inkRemain;
	private int repetition;

	public InkPrinter(String modelName, String manufacturer, String interfaceType, int printNum, int amountPaper,
			int inkRemain, int repetition) {
		super(modelName, manufacturer, interfaceType, printNum, amountPaper);
		this.inkRemain = inkRemain;
		this.repetition = repetition;
	}

	@Override
	public void print() {
		for (int i = 1; i <= this.repetition; i++) {
			if (this.amountPaper <= 0 || this.inkRemain <= 0) {
				System.out.println("프린터기에 잉크나 종이가 없습니다.");
				return;
			} else {
				System.out.println("InkPrinter의 모델명 : " + this.modelName);
				System.out.println("InkPrinter의 제조사 : " + this.manufacturer);
				System.out.println("InkPrinter의 인터페이스 종류 : " + this.interfaceType);
				System.out.println("InkPrinter의 현재 인쇄매수 : " + this.printNum);
				System.out.println("InkPrinter의 남은 인쇄 종이 : " + this.amountPaper);
				System.out.println("InkPrinter의 잉크 잔량 : " + this.inkRemain);
				--this.amountPaper;
				++this.printNum;
				--this.inkRemain;
				System.out.println("------------------------------");
			}
		}

	}
}