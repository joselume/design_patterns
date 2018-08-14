package com.design.patterns;

public class BasicWebPage implements IWebPage {

	private String html = "html";
	private String styleSheet = "styleSheet";
	private String scripts = "scripts";
	
	public void display() {
      System.out.println("Basic web page");		
	}

}
