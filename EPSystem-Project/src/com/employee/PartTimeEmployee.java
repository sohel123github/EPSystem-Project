package com.employee;

public class PartTimeEmployee extends Employee{

	private int workinghours;
	private double hourlyrate;
	
	public PartTimeEmployee (String name, int id, int workinghours, double hourlyrate ) {
		super(name, id);
		this.workinghours = workinghours;
		this.hourlyrate = hourlyrate;
	}
	
	@Override
	public double calculateSalary() {
		return workinghours * hourlyrate ;
	}
	
	
	
	
	
	
}
