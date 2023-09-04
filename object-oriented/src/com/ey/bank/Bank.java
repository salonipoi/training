package com.ey.bank;

public interface Bank {
//Application Behaviour(API)
	void summary();

	// Application Constants
	public static final int INIT_ACCOUNT_NO = 10101;
	public static final double MIN_SAVINGS_BAL = 1000;
	public static final double OPENING_CURRENT_BAL = 5000;
	public static final double MIN_CURRENT_BAL = 0;
	public static final double OVERDRAFT_LIMIT = 10000;

	void deposit(double amount);

	void withdraw(double amount) throws BalanceException;
}
