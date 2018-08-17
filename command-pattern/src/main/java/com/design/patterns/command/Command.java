package com.design.patterns.command;

import com.design.patterns.client.Application;
import com.design.patterns.receiver.Editor;

//Abstract command defines the common interface for all
//concrete commands.
public abstract class Command {
	
	protected Application app; 
	protected Editor editor;
	protected String backup;
	
	public Command (Application app, Editor editor)
	{
		this.app = app;
		this.editor = editor;
	}
	
	// Make a backup of the editor's state.
	public void saveBackup()
	{
		this.backup = editor.getText();
	}
	
	// Restore the editor's state.
	public void undo()
	{
		this.editor.setText(this.backup);
	}
	
	// The execution method is declared abstract in order to
    // force all concrete commands to provide their own
    // implementations. The method must return true or false
    // depending on whether or not the command changes the
    // editor's state.	
	public abstract boolean execute(); 
}
