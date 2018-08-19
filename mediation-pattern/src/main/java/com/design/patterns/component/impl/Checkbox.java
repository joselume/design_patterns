package com.design.patterns.component.impl;

import com.design.patterns.component.Component;
import com.design.patterns.mediatior.Mediator;

//Concrete components do not talk to each other. They have only
//one communication channel, which is sending notifications to
//the mediator.
public class Checkbox extends Component{
	boolean checked;
	
	public Checkbox(Mediator dialog) {
		super(dialog);
		this.checked = false;
	}
	
	public boolean isChecked () {
		return this.checked;
	}
	@Override
	public void click() {		
		this.checked = !this.checked;
		dialog.notify(this, "check");		
	}

}
