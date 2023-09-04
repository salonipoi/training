package com.ey.emp;
public class Clerk extends Employee {
private double commission;

public Clerk() {
	super();
}

public Clerk(String empName, double salary, double commission) {
	// constructor chaining: Calling constructor of parent class with matching
	// signature
	super(empName, salary);
	this.commission = commission;

}

@Override
public double getSalary() {
	// TODO Auto-generated method stub
	return super.getSalary() + commission;
	
}

@Override
public void payslip() {
	// TODO Auto-generated method stub
	super.payslip();
	System.out.println("Commission:" + commission);
}


}
