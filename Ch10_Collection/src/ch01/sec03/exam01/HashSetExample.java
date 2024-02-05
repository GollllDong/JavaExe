package ch01.sec03.exam01;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		// HashSet 컬렉션 객체 생성
		Set<String> set = new HashSet<String>();

		// 객체 저장
		set.add("Java");
		set.add("JEBC");
		set.add("JSP");
		set.add("Java");	// 중복 객체이므로 저장하지 않음
		set.add("Spring");
		
		// 저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수 :" + size);
	}
}
