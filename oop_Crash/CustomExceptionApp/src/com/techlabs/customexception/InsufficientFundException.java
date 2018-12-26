package com.techlabs.customexception;

public class InsufficientFundException extends Throwable {
	private Account acc;
	private double ammount1;

	public InsufficientFundException(Account acc, double ammount1) {
		this.acc = acc;
        this.ammount1=ammount1;
	}
	public Double getAmmount1()
	{
		return ammount1;
	}

	@Override
	public String getMessage() {
		return String.format(" Account no = " + acc.getAccountId() + " Name = "
				+ acc.getName() + " Trying to withdraw " + this.getAmmount1()
				+ " Which is inssufficient to WithDraw due to less balance in their account ");
	}

}
