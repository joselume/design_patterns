package com.design.patterns.invoker;

import com.design.patterns.command.Command;

public class Button {
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}	
	
	public boolean executeCommand()
	{
		return this.command.execute();
	}
}
