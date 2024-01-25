package ch02.transtype05;

public class TransDataType {

	public static void main(String[] args) {
		int total = 297;	//총점
		int stNum = 4;		//학생수
		double avg = 0;		//평균
		System.out.println("총점은 " + total + "입니다");
		avg = total/stNum;
		System.out.println("평균은 " + avg + "입니다");
		avg = (double)total/stNum;	
		// 컴파일러가 total을 double형으로 변환시켜줌
		/*
		 * 실수와 정수의 연산 결과는 ?
		 * 표현범위가 실수 > 정수 이므로
		 * 결과값은 실수로 출력된다.
		 * */
		System.out.println("평균은 " + avg + "입니다");
		
		int nAvg = (int)avg;
		System.out.println("평균은 " + nAvg + "입니다");
		
		char ch = 'g';
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((char)66);
	}

}
