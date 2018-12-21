package com.techlabs.accountpolymorphism;

public class SavingAccount extends Account{
	

	public SavingAccount(String name, double balance, int accountId) {
		super(name, balance, accountId);
	
	}

	@Override
	public void withdraw(int ammount) {
		if (this.getbalance() - ammount >MIN_BALANCE) {
			this.balance = this.getbalance() - ammount;

		} else {
			this.balance = balance;
		}
		
		
	}
	
	
	

}
