package ch01.collection02.hashmap02;


import java.util.HashMap;
import java.util.Scanner;

public class EmployeeManager {
    private final int EMP_NUM = 100;   // 100명 사원이 최대
    // Employee의 객체를 value로 준다;
    private HashMap<String, Employee> empMap = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    private int viewMenu() {
        System.out.println("[ 사원 선택 ]");
        System.out.println("1. 정규직");
        System.out.println("2. 임시직");
        System.out.println("3. 일용직");
        System.out.println("4. 전체정보보기");
        System.out.println("5. 정규직 보기");
        System.out.println("6. 임시직 보기");
        System.out.println("7. 일용직 보기");
        System.out.println("8. 종료");
        System.out.println("번호 입력 >> ");
        int sel = sc.nextInt();
        return sel;
    }
    private RegularEmployee createRegularEmployee() {
        System.out.print("사번 >> ");
        String empno = sc.next();
        if(empMap.containsKey(empno)) {
            System.out.println("기존에 등록된 사원입니다. 다시 시도해주세요.");
            RegularEmployee emp = createRegularEmployee();
            return emp;
        }else {
            System.out.print("이름 >> ");
            String name = sc.next();
            System.out.print("연봉 >> ");
            int yearSalary = sc.nextInt();
            System.out.print("보너스 >> ");
            int bonus = sc.nextInt();

            RegularEmployee emp =
                    new RegularEmployee(empno, name, yearSalary, bonus);
            return emp;
        }
    }
    private TempEmployee createTempEmployee() {
        System.out.print("사번 >> ");
        String empno = sc.next();
        if (empMap.containsKey(empno)) {
            System.out.println("기존에 등록된 사원입니다. 다시 시도해주세요.");
            TempEmployee emp =createTempEmployee();
            return emp;
        } else {
            System.out.print("이름 >> ");
            String name = sc.next();
            System.out.print("연봉 >> ");
            int yearSalary = sc.nextInt();
            System.out.print("계약기간 >> ");
            int hireYear = sc.nextInt();
            TempEmployee emp =
                    new TempEmployee(empno, name, yearSalary, hireYear);
            return emp;
        }
    }
    private PartTimeEmployee createPartTimeEmployee() {
        System.out.print("사번 >> ");
        String empno = sc.next();
        if (empMap.containsKey(empno)) {
            System.out.println("기존에 등록된 사원입니다. 다시 시도해주세요.");
            PartTimeEmployee emp = createPartTimeEmployee();
            return emp;
        } else {
            System.out.print("이름 >> ");
            String name = sc.next();
            System.out.print("일당 >> ");
            int dailyPay = sc.nextInt();
            System.out.print("일한 일수 >> ");
            int workDay = sc.nextInt();
            PartTimeEmployee emp =
                    new PartTimeEmployee(empno, name, dailyPay, workDay);
            return emp;
        }
    }

    private void viewAllEmployeeInfo() {
        for(Employee emp : empMap.values()) {
            emp.showEmployeeInfo();
        }
    }
    private void viewRegEmployeeInfo() {
        for(Employee emp : empMap.values()) {
            if(emp instanceof RegularEmployee)
                emp.showEmployeeInfo();
        }
    }
    private void viewTempEmployeeInfo() {
        for(Employee emp : empMap.values()) {
            if(emp instanceof TempEmployee)
                emp.showEmployeeInfo();
        }
    }
    private void viewPartTimeEmployeeInfo() {
        for(Employee emp : empMap.values()) {
            if(emp instanceof PartTimeEmployee)
                emp.showEmployeeInfo();
        }
    }
    public void run() {
        boolean isRun = true;
        while(isRun) {
            int selNum = viewMenu();
            Employee emp = null;

            switch(selNum) {
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
                case EmpMenu.REG_INFO:
                    viewRegEmployeeInfo();
                    break;
                case EmpMenu.TEMP_INFO:
                    viewTempEmployeeInfo();
                    break;
                case EmpMenu.PART_INFO:
                    viewPartTimeEmployeeInfo();
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

            // emp객체가 존재한다면
            if(emp != null) {
                if(empMap.size() < EMP_NUM) {
                    empMap.put(emp.getEmpno(), emp);
                }else {
                    System.out.println("더 이상 저장 공간이 없습니다.");
                }
            }
            System.out.println("---------------");
            System.out.println("Program Exit...");

        }
    }
}