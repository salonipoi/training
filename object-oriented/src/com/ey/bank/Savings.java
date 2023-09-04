package com.ey.bank;

public class Savings extends Accounts {

	public Savings() {

	}

	public Savings(String holder) {

		super(holder, MIN_SAVINGS_BAL);

		txns.add(new Transaction("OB", MIN_SAVINGS_BAL, balance));

	}

	@Override

	public void withdraw(double amount) throws BalanceException {

		if (amount <= (balance - MIN_SAVINGS_BAL)) {

			balance -= amount;

			txns.add(new Transaction("DR", amount, balance));

		}

		else

			throw new BalanceException("Insuffiecient Funds");

	}

}