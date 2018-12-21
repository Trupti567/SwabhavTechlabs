package com.techlabs.testsavingaccount;

import com.techlabs.accountpolymorphism.CurrentAccount;

public class TestCurrent {
	public static void main(String args[])
	{
		CurrentAccount current=new CurrentAccount("Manjusha", 1000, 101);
		 current.withdraw(3000);
		 current.printSlip(current);
		
	}

}
