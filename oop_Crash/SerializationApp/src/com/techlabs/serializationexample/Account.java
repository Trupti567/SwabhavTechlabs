package com.techlabs.serializationexample;

import java.io.Serializable;

public class Account implements Serializable{
	private int accountId;
	private String name;
	private double balance;
	Account(int accountId,String name,double balance)
	{
		this.accountId=accountId;
		this.name=name;
		this.balance=balance;
	}
	public int getAccountId()
	{
		return accountId;
	}
	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposite(int ammount)
	{
		this.balance=this.getBalance()+ammount;
	}

}
