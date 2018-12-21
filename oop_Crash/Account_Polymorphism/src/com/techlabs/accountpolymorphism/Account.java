package com.techlabs.accountpolymorphism;

public abstract class Account {
	protected String name;
	protected double balance;
	protected int accountId;
	protected  final int MIN_BALANCE = 500;

	public Account(String name, double balance, int accountId) {
		this.name = name;
		this.balance = balance;
		this.accountId = accountId;
	}

	abstract void withdraw(int ammount);

	public void deposite(int ammount) {
		this.balance = this.balance + ammount;
	}

	public String getname() {
		return name;
	}

	public double getbalance() {
		return balance;
	}

	public int getId() {
		return accountId;
	}
	public  void printSlip(Account a) {
		System.out.println(" Name :" +a.getname() + " AccountId :"
				+ a.getId() + " Balance " + a.getbalance());
	}


	

	
}
