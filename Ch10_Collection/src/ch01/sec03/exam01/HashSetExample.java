package ch01.sec03.exam01;

import java.util.*;

/* Set은 집합이다.
 * 집합은 데이터의 모음일 뿐 '순서가 보장되지 않는다.' 
 * 그러므로 중복을 허용하지 않는다.
 * A = {1, 2, 3}
 * B = {4, 5, 6}
 * C = A B가 겹치는 합집합 = {1, 2, 3, 4, 5}
 * 데이터가 입력될 때 기존 데이터가 있는지 확인한다.
 * 이때 사용하는 알고리즘이 Hash 알고리즘이다.
 * */

public class HashSetExample {
	public static void main(String[] args) {
		// HashSet 컬렉션 객체 생성
		Set<String> set = new HashSet<String>();

		// 객체 저장
		set.add("Java");	// list로 저장하면 순서가 있지만 set으로 하면 순서가 없고, 해시의 순서대로 순서결정.
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// 중복 객체이므로 저장하지 않음
		set.add("iBaTis");
		set.add("python");		
		set.add("python");	
		set.add("iBaTis");
		
		// 저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수 :" + size);
		System.out.println();
		
		// 객체에 값 저장된것을 모두 확인
		for(String element : set) {	
			System.out.println(element);
		}
	}
}
