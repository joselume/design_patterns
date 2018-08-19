package com.design.patterns.mediatior;

import com.design.patterns.component.Component;

//The mediator interface.
public interface Mediator {
	public void notify(Component sender, String event);
}
