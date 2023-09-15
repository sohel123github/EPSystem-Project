package com.employee;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("====== **** WELCOME TO EMPLOYEE PAYROLL SYSTEM **** ======");
		System.out.println();
		
		PayrollSystem prs = new PayrollSystem();
		
		FullTimeEmployee emp1 = new FullTimeEmployee("Sohel", 1, 40000);
		PartTimeEmployee emp2 = new PartTimeEmployee("Raj", 2, 10, 50.00);
		PartTimeEmployee emp3 = new PartTimeEmployee("Jay", 3, 12, 50.00);
		
//		ADDING EMPLOYEE-
		prs.addEmployee(emp1);
		prs.addEmployee(emp2);
		
//		REMOVING EMPLOYEE-
		prs.removeEmployee(3);
		
//		DISPLAY ALL EMPLOYEE-
		prs.displayEmployees();
		
		
	}
}
