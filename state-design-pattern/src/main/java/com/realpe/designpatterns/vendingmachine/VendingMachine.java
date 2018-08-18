package com.realpe.designpatterns.vendingmachine;

public class VendingMachine {

	private IState state;
	
	private IState idleState;
	private IState hasOneDollarState;	
	private IState outOfStockState;
	
	private int count;
	
	VendingMachine(int initialCount)
	{
		this.count = initialCount;
		this.idleState = new IdleState();
		this.hasOneDollarState = new HasOneDollarState();		
		this.outOfStockState = new OutOfStockState();
		
		if (this.count > 0)
		{
			this.state = this.idleState;
		} else
		{
			this.state = this.outOfStockState;
		}		
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public IState getState() {
		return state;
	}

	public void setState(IState state) {
		this.state = state;
	}	
	
	
	public IState getIdleState() {
		return idleState;
	}

	public void setIdleState(IState idleState) {
		this.idleState = idleState;
	}

	public IState getHasOneDollarState() {
		return hasOneDollarState;
	}

	public void setHasOneDollarState(IState hasOneDollarState) {
		this.hasOneDollarState = hasOneDollarState;
	}

	public IState getOutOfStockState() {
		return outOfStockState;
	}

	public void setOutOfStockState(IState outOfStockState) {
		this.outOfStockState = outOfStockState;
	}	
	
	public void doReturnMoney()
	{
		System.out.println("Returning money");
	}
	
	public void doReleaseProduct()
	{
		this.count = this.count - 1;
	}
	
	public void insertDollar() {				
		state.insertDollar(this);
	}

	public void ejectMoney() {
		state.ejectMoney(this);
	}

	public void dispense() {
		state.dispense(this);
	}	
}
