package ch01.sec05.exam03;

public class Person implements Comparable<Person> {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name); // 이름 앞자리의 ㄱㄴㄷㄹㅁㅂㅅ 순서로 나오게
//		if (age < o.age) // 오름차 순, 내림차 순으로 만들어 줄 수 있다.
//			//if (name.hashCode() < o.name.hashCode()) 처럼 해시코드로도 가능하다.
//			return -1;
//		else if (age == o.age)
//			return 0;
//		else
//			return 1;
//	}
	}
}
