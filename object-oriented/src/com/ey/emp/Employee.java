package com.ey.emp;

public abstract class Employee {
	private int empNo;
	private String empName;
	private double salary;
	
	private static int counter;

	static {//Static initializer block - executes at the time of the class loading 
		System.out.println("Account class loaded...");
		counter = 910;
	}
	
	{//ghost block executes for every constructor
		System.out.println("Employee object created..");
	}
	
	public Employee() {
	}

	public Employee(String empName, double salary) {
		System.out.println("Employee constructor...");// To check if it i printed before the constructor or after 
		this.empNo = counter ++;
		this.empName = empName;
		this.salary = salary;

	}

	public void payslip() {
		System.out.println("Emp No:" + empNo);
		System.out.println("Emp Name:" + empName);
		System.out.println("Salary:" + salary);
	}

	public double getSalary() {
		return salary;
	}

	public void details() {
		// TODO Auto-generated method stub

	}

	public String getCreditLimit() {
		// TODO Auto-generated method stub
		return null;
	}

}
