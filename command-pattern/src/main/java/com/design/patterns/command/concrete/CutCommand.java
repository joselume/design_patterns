package com.design.patterns.command.concrete;

import com.design.patterns.client.Application;
import com.design.patterns.command.Command;
import com.design.patterns.receiver.Editor;

public class CutCommand extends Command {

	public CutCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean execute() {
		saveBackup();
		app.setClipboard(editor.getSelection());
		editor.deleteSelection();
				
		return true;
	}
}
