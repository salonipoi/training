package com.ey.bank;

public class Savings extends Accounts {
	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAVINGS_BAL);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= (balance - MIN_SAVINGS_BAL))
			balance -= amount;
		else
			throw new BalanceException("Insufficient balance!");

		// super.withdraw(amount);
	}

}
