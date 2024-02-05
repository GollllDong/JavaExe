package ch09.resolve14.resolve1;

public abstract class Printer {	     // 각 클래스파일별로 생성자 초기화로 값 할당받고 그걸 필드에 저장
	protected String modelName;   	 // 모델명
	protected String manufacturer;   // 제조사
	protected String interfaceType;  // 인터페이스 종류
	protected int printNum; 	     // 현재 인쇄매수
	protected int amountPaper;		 // 남은 인쇄 종이
	
	
	public Printer(String modelName, String manufacturer, String interfaceType, int printNum, int amountPaper) {
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.interfaceType = interfaceType;
		this.printNum = printNum;
		this.amountPaper = amountPaper;
	}
	
	public abstract void print();  // 추상 메소드
	
	public int view_remain() {
		return amountPaper;
	}
}
