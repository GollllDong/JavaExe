package ch09.abstract10;

import java.util.Scanner;

public class EmployeeManager {
	private final int EMP_NUM = 100; // 100명 사원이 최대
	// Employee의 자식객체들을 저장
	private Employee[] empArr = new Employee[EMP_NUM];
	private int numOfEmp = 0; // 저장된 사원객체 수
	private Scanner sc = new Scanner(System.in);

	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 종료");
		System.out.println("번호 입력 >>>");
		int sel = sc.nextInt();
		return sel;
	}

	private RegularEmployee createRegularEmployee() {
		System.out.println("사번 >>> ");
		String empno = sc.next();
		System.out.println("이름 >>> ");
		String name = sc.next();
		System.out.println("연봉 >>> ");
		int yearSalary = sc.nextInt();
		System.out.println("보너스 >>> ");
		int bonus = sc.nextInt();
		
		RegularEmployee emp = new RegularEmployee(empno, name, yearSalary, bonus);
		
		return null;
	}
	private TempEmployee createTempEmployee() {
		return null;
	}

	private PartTimeEmployee createPartTimeEmployee() {
		return null;
	}

	private boolean saveEmployee(Employee emp) {
		return true;
	}

	private void viewAllEmployeeInfo() {

	}

	public void run() {
		boolean isRun = true;
		while (isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			switch (selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				emp = null;
				viewAllEmployeeInfo();
				break;
			case EmpMenu.EXIT:
				emp = null;
				isRun = false;
				break;
			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			//emp객체가 존재한다면
			if(emp!= null) {
				boolean isSave = saveEmployee(emp);
				if(!isSave) {
					System.out.println("더 이상 저장 공간이 없습니다.");
				}
			}
		}
		System.out.println("program Exit...");
	}

}
