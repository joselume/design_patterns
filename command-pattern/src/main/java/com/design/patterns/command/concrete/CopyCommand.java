package com.design.patterns.command.concrete;

import com.design.patterns.client.Application;
import com.design.patterns.command.Command;
import com.design.patterns.receiver.Editor;

//Concrete commands.
public class CopyCommand extends Command {

	public CopyCommand(Application app, Editor editor) {
		super(app, editor);
	}

	// The copy command is not saved to the history since it
    // does not change editor's state.
	@Override
	public boolean execute() {
		app.setClipboard(editor.getSelection());
		return false;
	}
}
