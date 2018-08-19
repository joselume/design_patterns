package com.design.patterns.component;

import com.design.patterns.mediatior.Mediator;

//Components communicate with a mediator using the mediator
//interface. Thanks to that, you can use the same components in
//other contexts by linking them with a different mediator
//object.
public class Component {
	protected Mediator dialog;
	
	public Component (Mediator dialog) {
		this.dialog = dialog;
	}
	
	public void click () {
		dialog.notify(this, "click");
	}
	
	public void keypress () {
		dialog.notify(this, "keypress");
	}
}
