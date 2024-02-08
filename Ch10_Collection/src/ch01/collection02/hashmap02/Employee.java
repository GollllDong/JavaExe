package ch01.collection02.hashmap02;

public abstract class Employee {
	protected String empno;		// 사번
	protected String name;		// 이름
	
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	public String getEmpno() {	// HashMap메서드의 사번을 키값으로 설정
		return empno;
	}
	public void showEmployeeInfo() {
		System.out.println("-------------------");
		System.out.println("empno : " + empno);
		System.out.println("name : " + name);
	}
	public abstract double getMonthPay();	// 추상 메서드

	public abstract int checkduplicate();
	
//	public abstract String getViewInfo();
}
