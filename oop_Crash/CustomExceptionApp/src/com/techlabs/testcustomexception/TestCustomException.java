package com.techlabs.testcustomexception;

import com.techlabs.customexception.Account;
import com.techlabs.customexception.InsufficientFundException;

public class TestCustomException {
	public static void main(String args[]) throws InsufficientFundException {
		Account acc1 = new Account("100", "Trupti", 1000);
		try {
			acc1.withdraw(1000);
			System.out.println(acc1);

		} catch (InsufficientFundException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
