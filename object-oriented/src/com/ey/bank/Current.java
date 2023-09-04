package com.ey.bank;

public class Current extends Accounts {
	private double overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, OPENING_CURRENT_BAL);
		this.overdraft = OVERDRAFT_LIMIT;

	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft7:" + overdraft);
	}

	@Override
	public void deposit(double amount) {
		// super.deposit(amount);
		overdraft += amount;
		if (overdraft > OVERDRAFT_LIMIT) {
			balance += (overdraft - OVERDRAFT_LIMIT);
			overdraft = OVERDRAFT_LIMIT;

		}
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		// super.withdraw(amount);
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < MIN_CURRENT_BAL) {
				overdraft -= balance;
				balance = MIN_CURRENT_BAL;
			} else
				throw new BalanceException("Insufficient balance");
		}
	}
}
//correct the error on the snippet
