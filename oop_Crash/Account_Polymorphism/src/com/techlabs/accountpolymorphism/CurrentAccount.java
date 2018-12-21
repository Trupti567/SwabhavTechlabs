/**
 * 
 */
package com.techlabs.accountpolymorphism;

/**
 * @author Trupti
 *
 */
public class CurrentAccount extends Account{
	private static  final double DRAFT_VALUE=-2000;

	public CurrentAccount(String name, double balance, int accountId) {
		super(name, balance, accountId);
		
	}

	@Override
	public void withdraw(int ammount) {
		if(this.getbalance()-ammount>=DRAFT_VALUE)
		{
			this.balance=this.balance-ammount;
		}
		
		
		
	}
	

}
