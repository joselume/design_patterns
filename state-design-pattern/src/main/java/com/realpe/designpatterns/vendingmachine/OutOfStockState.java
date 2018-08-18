package com.realpe.designpatterns.vendingmachine;

public class OutOfStockState implements IState {

	public void insertDollar(VendingMachine vendingMachine) {
		System.out.println("Machine is out of stock");
		vendingMachine.doReturnMoney();
	}

	public void ejectMoney(VendingMachine vendingMachine) {
		System.out.println("Machine is out of stock");
	}

	public void dispense(VendingMachine vendingMachine) {
		System.out.println("Machine is out of stock");
	}

}
