package com.techlabs.generic.test;

import java.util.ArrayList;

import com.techlabs.lineitems.LineItems;

public class GenericTest {
	public static void main(String args[])
	{
		ArrayList<LineItems> cart=new ArrayList<LineItems>();
		cart.add(new LineItems(101, "Laptops", 25000, 2));
		cart.add(new LineItems(103, "Schoolbag", 600, 3));
		
		for(LineItems item:cart)
		{
			System.out.println(" ProductId= " + item.getProductid()
					+ " Product name = " + item.getProductname()
					+ " Product price = " + item.getProductPrice()
					+ "Product Quantitty " + item.getQuantity()+" total "+item.calculateTotalPrice());

		}
		
	}

}
