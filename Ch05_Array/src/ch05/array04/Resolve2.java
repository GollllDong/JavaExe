package ch05.array04;

public class Resolve2 {

	public static void main(String[] args) {
		//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
		String[] names = {"정범수", "안은선", "김원종", "김경식", "엄기은", "김동규", "배현석", "손흥민", "김민재", "이강인"};
		for (int i = 9; i < names.length; i--) {
			System.out.println((i+1)+"번째 : "+names[i]);
			
			if(names[i] == "정범수") {
				break;
			}
		}
	
	}

}
