package com.design.patterns.client;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import com.design.patterns.command.Command;
import com.design.patterns.receiver.Editor;

public class Application {
	private String clipboard;
	private List<Editor> editors;
	private Editor activeEditor;
	private Deque<Command> CommandHistory = new ArrayDeque<Command>();
	
	
	// Quedé implementando este método:
	public void createUI()
	{
		copy = function() { executeCommand(
	            new CopyCommand(this, activeEditor)) };
		
	        copyButton.setCommand(copy)
	        shortcuts.onKeyPress("Ctrl+C", copy)

	        cut = function() { executeCommand(
	            new CutCommand(this, activeEditor)) }
	        cutButton.setCommand(cut)
	        shortcuts.onKeyPress("Ctrl+X", cut)

	        paste = function() { executeCommand(
	            new PasteCommand(this, activeEditor)) }
	        pasteButton.setCommand(paste)
	        shortcuts.onKeyPress("Ctrl+V", paste)

	        undo = function() { executeCommand(
	            new UndoCommand(this, activeEditor)) }
	        undoButton.setCommand(undo)
	        shortcuts.onKeyPress("Ctrl+Z", undo)		
	}
	

	public String getClipboard() {
		return clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
	}	
	
	public void executeCommand(Command command)
	{
		if (command.execute())
		{
			CommandHistory.push(command);
		}
	}
	
	public void undo()
	{
		Command command = CommandHistory.pop();
		if (command != null)
		{
			command.undo();
		}
	}		
}
