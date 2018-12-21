package com.techlabs.testsavingaccount;

import com.techlabs.accountpolymorphism.Account;
import com.techlabs.accountpolymorphism.CurrentAccount;
import com.techlabs.accountpolymorphism.SavingAccount;

public class TestPolymorphism {
	public static void printSlip(Account account) {
		System.out.println(" Name :" + account.getname() + " AccountId :"
				+ account.getId() + " Balance " + account.getbalance());
	}

	public static void main(String args[]) {
		SavingAccount account=new SavingAccount("Trupti", 2000, 101);
		account.deposite(1000);
		printSlip(account);
		account.withdraw(1000);
	    printSlip(account);
	    
	    CurrentAccount current=new CurrentAccount("Manju", 2000, 101);
	    printSlip(current);
	    current.deposite(1000);
	    printSlip(current);
	    

	}
}