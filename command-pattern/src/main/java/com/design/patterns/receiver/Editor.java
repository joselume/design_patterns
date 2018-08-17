package com.design.patterns.receiver;

public class Editor {	
	private String text;
	
	private String selection;

	public String getSelection() {
		return selection;
	}	
	
	public void deleteSelection() {
		this.selection = "";
	}
	
	public void replaceSelection(String text) {
		this.selection = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
