package ch12.sec03.exam03;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {	// 다른 클래스들은 패키지 경로 파일이름 @ 해시코드로 나오는데 String 클래스는 문자열을 리턴해준다.
		return company + ", " + os;
	}
	
	
}
