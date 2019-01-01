package com.techlabs.lineitem.test;

import java.util.ArrayList;

import com.techlabs.lineitems.LineItems;

public class LineItemTest {
	public static void main(String args[]) {
		ArrayList cart1 = new ArrayList();
		cart1.add(new LineItems(102, "BasketBall", 500, 4));
		cart1.add(new LineItems(103, "FootBall", 500, 2));
		cart1.add(new LineItems(104, "tennisBall", 600, 2));
		//cart1.add("hello");

		for (Object item : cart1) {
			LineItems line = (LineItems) item;
			System.out.println(" ProductId= " + line.getProductid()
					+ " Product name = " + line.getProductname()
					+ " Product price = " + line.getProductPrice()
					+ "Product Quantitty " + line.getQuantity()+" total "+line.calculateTotalPrice());

		}

	}

}
