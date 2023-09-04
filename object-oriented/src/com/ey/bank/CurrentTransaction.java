package com.ey.bank;

public class CurrentTransaction extends Transaction {
	private double overdraft;

	public CurrentTransaction() {
	}

	public CurrentTransaction(String type, double amount, double balance, double overdraft) {
		super(type, amount, balance);
		this.overdraft = overdraft;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + overdraft;
	}

}
