package com.techlabs.testsavingaccount;

import com.techlabs.accountpolymorphism.SavingAccount;

public class TestSavingAccount {
	public static void main(String args[])
	{
		SavingAccount savingaccount=new SavingAccount("Trupti", 500, 101);
		savingaccount.printSlip(savingaccount);
		savingaccount.deposite(2000);
		savingaccount.printSlip(savingaccount);
		savingaccount.withdraw(200);
		savingaccount.printSlip(savingaccount);
		
		SavingAccount savingaccount2=new SavingAccount("Manjusha", 1000, 102);
		savingaccount.printSlip(savingaccount2);
		savingaccount2.withdraw(500);
		savingaccount.printSlip(savingaccount2);
		
		
	}

}
