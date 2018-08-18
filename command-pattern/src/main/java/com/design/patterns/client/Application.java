package com.design.patterns.client;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import com.design.patterns.command.Command;
import com.design.patterns.command.concrete.CopyCommand;
import com.design.patterns.command.concrete.CutCommand;
import com.design.patterns.command.concrete.PasteCommand;
import com.design.patterns.command.concrete.UndoCommand;
import com.design.patterns.invoker.Button;
import com.design.patterns.receiver.Editor;

public class Application {
	private String clipboard;
	private List<Editor> editors;
	private Editor activeEditor;
	private Deque<Command> CommandHistory;
	Button copyButton;
	Button cutButton;
	Button pasteButton;
	Button undoButton;
	
	public Application () {
		clipboard = "";
		editors = new ArrayList<Editor>();
		activeEditor = new Editor();
		CommandHistory = new ArrayDeque<Command>();	
		copyButton = new Button();
		cutButton = new Button();
		pasteButton = new Button();
		undoButton = new Button();
	}	
	
	// Quedé implementando este método:
	public void createUI()
	{			           
	    Command copyCommand = new CopyCommand(this, activeEditor);	    
	    copyButton.setCommand(copyCommand);
	        	    
	    Command cutCommand = new CutCommand(this, activeEditor);	    
	    cutButton.setCommand(cutCommand);
	        
	    Command pastCommand = new PasteCommand(this, activeEditor);	    
	    pasteButton.setCommand(pastCommand);
	    
	    Command undoCommand = new UndoCommand(this, activeEditor);	    
	    undoButton.setCommand(undoCommand);	  	
	}
	
	public String getClipboard() {
		return clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
	}	
		
	public void clickOnCopyButton() {
		this.executeEvent(this.copyButton);
	}
	
	public void clickOnCutButton() {
		this.executeEvent(this.cutButton);
	}
	
	public void clickOnPasteButton() {
		this.executeEvent(this.pasteButton);
	}
	
	public void clickOnUndoButton() {
		this.executeEvent(this.undoButton);
	}
	
	// Execute a command and check whether it has to be added to
    // the history.
	public void executeEvent (Button button)
	{
		if (button.executeCommand())
		{
			CommandHistory.push(button.getCommand());
		}
	}
	
	// Take the last command from the history and run its undo
    // method. Note that we do not know the class of that
    // command. But we don't have to, since the command knows
    // how to undo its own action.
	public void undo()
	{
		Command command = CommandHistory.pop();
		if (command != null)
		{
			command.undo();
		}
	}					
}
