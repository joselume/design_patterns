package com.realpe.designpatterns.vendingmachine;

public class Program
{
	public static void main (String [] argrs)
	{
		int initialStock = 2;			
		VendingMachine vendingMachine = new VendingMachine(initialStock);
		
		vendingMachine.insertDollar();
		vendingMachine.dispense();
	}	
}
 
