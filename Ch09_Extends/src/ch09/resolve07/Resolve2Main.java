package ch09.resolve07;


public class Resolve2Main {
	public static void main(String[] args) {
		Resolve2 tri1 = new Resolve2(10,10);
		Resolve2 tri2 = new Resolve2(9,6);
		
		System.out.println("1번 삼각형의 넓이 : "+tri1.TriArea());
		System.out.println("2번 삼각형의 넓이 : "+tri2.TriArea());
		
		tri1.setDownLine(20);
		tri2.setHeight(20);
		
		
		System.out.println("1번 삼각형의 넓이 : "+tri1.TriArea());
		System.out.println("2번 삼각형의 넓이 : "+tri2.TriArea());
		
		
	}
}