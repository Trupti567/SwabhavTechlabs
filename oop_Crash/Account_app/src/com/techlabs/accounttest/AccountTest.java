package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String args[]) {
		Account account = new Account("Trupti", 1000, false);
		Account account2 = new Account("Manju", 6000);
		Account account3=new Account("Aditya", 5000, false);
		System.out.println(account);
		System.out.println(account2);
		System.out.println(account3);
		account.withdraw(500);

		System.out.println("Balance After withdrawing Ammount");
	    System.out.println(account);
		account.deposite(1000);

		System.out.println("Balance After Deposit");
	    System.out.println(account);

	}

	

}
