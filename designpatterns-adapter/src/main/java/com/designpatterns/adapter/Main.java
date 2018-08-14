package com.designpatterns.adapter;

public class Main {
	public static void main (String [] args) {
		
		OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
		
		CoffeeTouchscreenAdapter coffeeTouchscreenAdapter = new CoffeeTouchscreenAdapter(oldCoffeeMachine);
		
		Client client = new Client(coffeeTouchscreenAdapter);
		
		client.chooseFirstSelection();
		
		client.chooseSecondSelection();
	}
}
