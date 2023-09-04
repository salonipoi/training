package com.ey.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Accounts implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	protected List<Transaction> txns;

	private static int autogen = INIT_ACCOUNT_NO;

	public Accounts() {
	}

	public Accounts(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		txns = new ArrayList<>();
	}

	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance:" + balance);

	}

//Business Logic
	public void deposit(double amount) {
		balance += amount;
		txns.add(new Transaction("CR", amount, balance));
	}

	public void statement() {
		System.out.println("your statemnt is:\n");
		for (Transaction transaction : txns) {
			txns.forEach(System.out::println);
		}

	}

	/*
	 * public void withdraw(double amount) { if (amount <= balance) balance -=
	 * amount; else System.out.println("Insufficent Balance!"); }
	 */
	// public abstract void withdraw(double amount);
}
