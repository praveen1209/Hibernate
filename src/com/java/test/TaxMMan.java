package com.java.test;


import java.util.*;

public class TaxMMan
{
	public TaxMMan()
	{
	}
 
	public static void main(String [] args) throws Exception
	{
		TaxMMan taxMan = new TaxMMan();
 
		// get purchase
		Vector<PurchaseItem> basket = taxMan.getPurchase();
		//System.out.println(basket);
 
		// print reciept
		taxMan.printReciept(basket);
 
	}
	
	public void printReciept(Vector<PurchaseItem> basket) throws Exception
	{
		float totPrice = 0.0f;
		float totTax = 0.0f;
 
		for(int i=0; i<basket.size(); i++)
		{
			PurchaseItem purchaseItem = basket.get(i);
 
			totPrice += purchaseItem.price;
			System.out.println("purchaseItem.price"+purchaseItem.price);//new
			
			totTax += purchaseItem.tax;
			System.out.println(purchaseItem);
			
			System.out.println("purchaseItem.tax"+purchaseItem.tax);//new

		}
 
		// round tax to near $0.05
		float reminder = totTax % 0.05f;
		if( reminder != 0.0f )
		{
			if( reminder == 0.05f ) // round up
				totTax += reminder;
			
			else // round up
				totTax = totTax + (0.05f - reminder);
			    totTax = Math.round(totTax);
			System.out.println("purchaseItem.reminder"+reminder);//new1
		}
		System.out.println("purchaseItem.reminder"+reminder);//new

		System.out.println("Sales Taxes: $"+totTax);
		System.out.println("Total: $"+(totPrice+totTax));
	}
 
	public Vector<PurchaseItem> getPurchase() throws Exception
	{
		// for getting keyboard input
		Scanner keyboard = new Scanner(System.in);
		String userInput = null;
 
		Vector<PurchaseItem> basket = new Vector<PurchaseItem>();
 
		int no = 1;
		while(true)
		{
			PurchaseItem purchaseItem = new PurchaseItem();
 
			System.out.print("Item"+no+" Qty: ");
			userInput = keyboard.nextLine();
			purchaseItem.qty = Integer.parseInt(userInput);
 
			System.out.print("Item"+no+" Name: ");
			userInput = keyboard.nextLine();
			purchaseItem.name = userInput;
 
			System.out.print("Item"+no+" Price: $");
			userInput = keyboard.nextLine();
			purchaseItem.price = Float.parseFloat(userInput);
 
			System.out.print("Item"+no+" Imported[y/n]: ");
			userInput = keyboard.nextLine();
			if(userInput.toLowerCase().equals("y"))
				purchaseItem.imported = true;
 
			System.out.println(purchaseItem.imported);
			
			System.out.print("Item"+no+" Exempted[y/n]: ");
			userInput = keyboard.nextLine();
			if(userInput.toLowerCase().equals("y"))
				purchaseItem.exempted = true;
			
			System.out.println(purchaseItem.exempted);
 
			 
			// compute tax
			purchaseItem.computeTax();
			
			
			// add to basket
			basket.add(purchaseItem);
			no++;
			
			System.out.print("More Item[y/n]: ");
			userInput = keyboard.nextLine();
			if(userInput.toLowerCase().equals("n"))
				break;
		}
		return basket;
	}
}
 
class PurchaseItem
{
	int qty = 0;
	String name = null;
	float price = 0.0f;
	boolean imported = false; // 10%
	boolean exempted = false; // 5%
 
	float tax = 0.0f;
	
	public String toString()
	{
		return qty+" "+name+" at $"+price+" (imported:"+imported+" exempted:"+exempted+")";
	}
	
	void computeTax()
	{
		float totTaxPercent = 0.0f;
 
		// check tax
		if(imported)
			totTaxPercent = 0.05f	;
		if(!exempted)
			totTaxPercent = 0.1f;
 
		// compute tax
		tax = totTaxPercent * price;
		
		System.out.println(tax);
	}
}