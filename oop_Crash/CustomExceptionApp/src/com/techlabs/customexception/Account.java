package com.techlabs.customexception;

public class Account {
	private String accountNo;
	private String name;
	private double balance;

	public Account(String accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public String getAccountId() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double ammount) {
		this.balance = this.balance + ammount;
	}

	public void withdraw(double ammount) throws InsufficientFundException {
		if (this.balance - ammount > 500) {
			this.balance = this.balance - ammount;
		} else {

			throw new InsufficientFundException(this, ammount);
		}
	}

	@Override
	public String toString() {
		return String.format(" Name = " + getName() + " AccountId = "
				+ getAccountId() + " Balance = " + getBalance());
	}

}
