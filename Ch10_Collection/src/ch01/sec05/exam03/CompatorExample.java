package ch01.sec05.exam03;

import java.util.TreeSet;

public class CompatorExample  {
	public static void main(String[] args) {
		// TreeSet 컬렉션 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();

		// 객체 저장
	    treeSet.add(new Person("홍길동",45));
	    treeSet.add(new Person("김자바", 25));
	    treeSet.add(new Person("차돌박이",31));
	    treeSet.add(new Person("임꺽정",51));
	    treeSet.add(new Person("정지민",63));
	    treeSet.add(new Person("머털도사",75));
	    treeSet.add(new Person("둘리",801));
	    treeSet.add(new Person("마이콜",55));
	    treeSet.add(new Person("홍길동",564));
	    treeSet.add(new Person("기영이",18));
	    
	    // 객체를 하나씩 가져오기

	    for(Person person : treeSet){
	        System.out.println(person.name+" : "+person.age);
	    }
		
	}
	
}
