package com.techlabs.lineitems;

public class LineItems {
	private int productId;
	private String name;
	private double price;
	private int quantity;
	public LineItems(int productId,String name,double price,int quantity)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public int getProductid()
	{
		return productId;
	}
	public String getProductname()
	{
		return name;
	}
	public double getProductPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	public double calculateTotalPrice()
	{
		this.price=this.price*this.quantity;
		return price;
	}

}
