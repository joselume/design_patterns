package com.designpatterns.adapter;

public class Client {
	
	private CoffeeMachineInterface coffeeMachine;
	
	public Client(CoffeeMachineInterface coffeeMachine) {
	  this.coffeeMachine = coffeeMachine;			
	}
	
	public void chooseFirstSelection() {
		coffeeMachine.chooseFirstSelection();;		
	}

	public void chooseSecondSelection() {
		coffeeMachine.chooseSecondSelection();		
	}			
}
