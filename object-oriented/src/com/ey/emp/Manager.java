package com.ey.emp;
public class Manager extends Employee {
	private double incentives;

	public Manager() {
		// optional:By default a child class calls the default constructor of parent
		// class
		super();

	}

	public Manager(String empName, double salary, double incentives) {
		// constructor chaining: Calling constructor of parent class with matching
		// signature
		super(empName, salary);
		this.incentives = incentives;

	}

	@Override
	public void payslip() {
		super.payslip();//Calling payslip() of super class
		System.out.println("Incentives:" + incentives);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + incentives;
	}
	
}
