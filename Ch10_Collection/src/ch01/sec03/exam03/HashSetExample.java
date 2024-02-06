package ch01.sec03.exam03;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		// HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();

		// 객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		/* 다른 컬렉션들도 Iterator인터페이스 상속을 받아 구현하였다.
		 * Iterator는 데이터의 처음부터 계속 끝까지 가져오는데 사용한다.
		 * 알고리즘이 다른 컬렉션을 Iterator 라는 1가지 방식으로 가져 올 수
		 * 있게 하였으므로 효율성을 가져온다.
		 * */

		// 객체를 하나씩 가져와서 처리
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			//객체를 하나 가져오기
			String element = iterator.next();
			System.out.println(element);
			
			if(element.equals("JSP")) {
				// 가져온 객체를 컬렉션에서 제거
				iterator.remove();
			}
		}
		System.out.println();
		
		// 객체 제거
		set.remove("JDBC");

		// 객체를 하나씩 가져와서 처리
		for(String element : set) {
			System.out.println(element);
		}
	}
}
