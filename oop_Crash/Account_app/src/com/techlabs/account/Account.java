package com.techlabs.account;

public class Account {
	private static final int MIN_BALANCE = 500;
	private static int autogenerate;
	private String name;
	private double balance;
	private boolean isActive;
	private int accountId;
	private static int transactioncount;
	static{
		autogenerate=1;
		transactioncount=0;
		
	}
	

	public Account(String name, double balance, boolean isActive) {

		this.name = name;
		this.balance = balance;
		this.isActive = isActive;
		accountId = autogenerate++;

	}

	public Account(String name, double balance) {
		this(name, balance, true);
	}

	public int getAccountId() {
		return accountId;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setisActive() {
		this.isActive = isActive;
	}

	public boolean getAccountStatus() {
		return isActive;
	}

	public void withdraw(int ammount) {
		transactioncount++;
		if (this.getBalance() - ammount > MIN_BALANCE) {
			this.balance = this.getBalance() - ammount;

		} else {
			this.balance = balance;
		}
	}

	public void deposite(int ammount) {
		transactioncount++;
		this.balance = this.getBalance() + ammount;
	}
	

	@Override
	public String toString() {
		return String.format(" Name :" + getName() + " Balance :"
				+ getBalance() + " AccountId " + getAccountId()
				+ " AccountStatus :" + getAccountStatus()+" TransactionCount is: "+getTransactionCount());
	}
	public static int getTransactionCount()
	{
		return transactioncount;
	}

}
