package ch09.resolve07.answer05;


/* 클래스 설계에서 접근권한 설정
 * 1) 필드 -> private
 *    메서드 -> public
 * 2) 메서드 중에 내부에서만 사용하는 메서드 -> private
 * 
 * 
 * */
public class Resolve5 {
	private int bead1;
	private int bead2;

	public Resolve5(int bead1, int bead2) {
		this.bead1 = bead1;
		this.bead2 = bead2;
	}
	public void FirstGame() {
		this.bead1 += 2;
		this.bead2 -= 2;
	}
	public void SecondGame() {
		this.bead2 += 7;
		this.bead1 -= 7;
	}
	public void View_Info() {
		int tmp1 = this.bead1;
		int tmp2 = this.bead2;
		System.out.println("첫번째 어린이 구슬 개수 : " + tmp1);
		System.out.println("두번째 어린이 구슬 개수 : " + tmp2);
	}

}
