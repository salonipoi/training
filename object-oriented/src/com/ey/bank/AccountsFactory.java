package com.ey.bank;

public final class AccountsFactory {
	// when an boj holds a value then it is state

	public AccountsFactory() {

	}

	public static Savings createSavingsAccount(String holder) {
		return new Savings(holder);
	}

	public static Current createCurrentAccount(String holder) {
		return new Current(holder);
	}
}
