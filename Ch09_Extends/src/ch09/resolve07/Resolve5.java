package ch09.resolve07;

public class Resolve5 {
	public static void main(String[] args) {
//		 main에서는 객체를 이렇게 만듭니다
//	     어린이1의 보유자산 -> 구슬 15개
//	     어린이2의 보유자산 -> 구슬 9개
//	     1차 놀이에서 어린이1은 어린이2의 구슬 2개를 획득한다
//	     2차 놀이에서 어린이2는 어린이 1의 구슬 7개를 획득한다
//	     마지막으로 각각의 어린이가 보유하고 있는 구슬의 수를 출력한다
//	     프로그램을 종료한다.
		Resolve5_1 re = new Resolve5_1(15, 9);
		re.FirstGame();
		re.SecondGame();
		re.View_Info();
	}
}
