package com.design.patterns.command.concrete;

import com.design.patterns.client.Application;
import com.design.patterns.command.Command;
import com.design.patterns.receiver.Editor;

public class UndoCommand extends Command {

	public UndoCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean execute() {
		System.out.println("UndoCommand.execute()");
		app.undo();
		
		return false;
	}	
}
