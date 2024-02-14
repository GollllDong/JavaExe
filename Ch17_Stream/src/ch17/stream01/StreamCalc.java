package ch17.stream01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCalc {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList();
		nameList.add("홍길동");
		nameList.add("알렉산드라");
		nameList.add("압둘알리");
		nameList.add("또치");
		nameList.add("톨스로이감자4세");
		nameList.add("세종대왕54세");
		nameList.add("프랑스나폴레옹");
		nameList.add("무하마드킹50제임스");
		nameList.add("아아아아아아아아");
		
		
		for(String name : nameList) {
			if(name.length() >= 5) {
				System.out.print(name + ", ");
			}
		}
		System.out.println();
		
		// .filter() 메서드를 단계별로 나누었을 때
		Stream<String> strm = nameList.stream();
		Stream<String> strmF = strm.filter(s -> s.length() >= 5);
		strmF.forEach(s -> System.out.print(s + ", "));
		System.out.println();
		
		// 한번 사용한 스트림은 재사용 불가능(내부 데이터를 모두 흘려보냈기 때문이다.)
//		System.out.println("-----------------");
//		strmF.forEach(s -> System.out.print(s + ", "));
//		System.out.println();
		
		nameList.stream()							// 1) 스트림 객체
				.filter(s -> s.length() >= 5)		// 2) 중간연산(참일 때 새로운 스트림)
				.filter(s -> s.length() < 10)		
				.forEach(s -> System.out.print(s + ", "));	// 최종연산

	}
}
