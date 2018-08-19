package com.design.patterns.component.impl;

import com.design.patterns.component.Component;
import com.design.patterns.mediatior.Mediator;

//Concrete components do not talk to each other. They have only
//one communication channel, which is sending notifications to
//the mediator.
public class Textbox extends Component {

	public Textbox(Mediator dialog) {
		super(dialog);
	}
}
