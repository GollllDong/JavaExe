package ch09.abstract10;

//System.out.println("[ 사원 선택 ]");
//System.out.println("1. 정규직");
//System.out.println("2. 임시직");
//System.out.println("3. 일용직");
//System.out.println("4. 전체정보보기");
//System.out.println("5. 종료");
//System.out.println("번호 입력 >>>");


public interface EmpMenu {
	public int REG_EMP = 1;
	public int TEMP_EMP = 2;
	public int PART_EMP =3;
	public int ALL_INFO = 4;
	public int VIEW_REG = 5;
	public int VIEW_TEMP = 6;
	public int VIEW_PART = 7;
	public int EXIT = 8;
}
