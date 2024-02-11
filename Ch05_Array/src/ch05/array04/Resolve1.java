package ch05.array04;

public class Resolve1 {

	public static void main(String[] args) {
		//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
		String[] names = {"정범수", "봉준호", "제이팍", "김모군", "이모군", "박모군", "황모군", "손흥민", "김민재", "이강인"};
		for (int i = 0; i < names.length; i++) {
			System.out.println((i+1)+" 번째 : "+names[i]);
		}
		for (String name : names) {
			System.out.println(name + ", ");
		}
		
		System.out.println();
	
	}

}
