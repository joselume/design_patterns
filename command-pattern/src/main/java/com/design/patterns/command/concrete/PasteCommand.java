package com.design.patterns.command.concrete;

import com.design.patterns.client.Application;
import com.design.patterns.command.Command;
import com.design.patterns.receiver.Editor;

public class PasteCommand extends Command {

	public PasteCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean execute() {
		saveBackup();
		editor.replaceSelection(app.getClipboard());
		
		return true;
	}
}
