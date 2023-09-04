package com.ey.shop;

public class Customer {
	private int custId;
	private String custName;
	private double creditLimit;

	private static int counter = 101;
	
	public Customer() {
	}

	public Customer(String custName, double creditLimit) {
		this.custId = counter++;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}

	public void details() {
		System.out.println("Customer id:" + custId);
		System.out.println("Customer Name:" + custName);
		System.out.println("Credit limit:" + creditLimit);
	}

	public double getCreditLimit() {
		return creditLimit;
	}

}
