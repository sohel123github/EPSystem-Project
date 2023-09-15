package com.employee;

public class FullTimeEmployee extends Employee {
	
	private double monthlySalary;
	
	public FullTimeEmployee (String name, int id, int monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}
	
	

	
}
