package com.ey.bank;

public class Current extends Accounts {

	private double overdraft;

	public Current() {

	}

	public Current(String holder) {

		super(holder, OPENING_CURRENT_BAL);

		this.overdraft = OVERDRAFT_LIMIT;

		txns.add(new CurrentTransaction("OB", OPENING_CURRENT_BAL, balance, overdraft));

	}

	@Override

	public void summary() {

		super.summary();

		System.out.println("Overdraft: " + overdraft);

	}

	@Override

	public void deposit(double amount) {

		overdraft += amount;

		if (overdraft > OVERDRAFT_LIMIT) {

			balance += (overdraft - OVERDRAFT_LIMIT);

			overdraft = OVERDRAFT_LIMIT;

		}

		txns.add(new CurrentTransaction("CR", amount, balance, overdraft));

	}

	@Override

	public void withdraw(double amount) throws BalanceException {

		if (amount <= (balance + overdraft)) {

			balance -= amount;

			if (balance < MIN_CURRENT_BAL) {

				overdraft += balance;

				balance = MIN_CURRENT_BAL;

			}

			txns.add(new CurrentTransaction("DR", amount, balance, overdraft));

		}

		else

			throw new BalanceException("Insuffiecient balance");

	}

}
//correct the error on the snippet
