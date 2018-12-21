package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class TestWithdrawAndDeposite {
	public static void main(String args[])
	{
		Account account=new Account("Trupti", 1000, false);
		Account account2=new Account("Nikita", 2000, false);
	    System.out.println(account);
		account.withdraw(600);
		  System.out.println(account);
		
		account.deposite(10000);
		  System.out.println(account);
		account2.deposite(3000);
		  System.out.println(account2);
		
		
	}
	
	
}
