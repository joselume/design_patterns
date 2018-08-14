package com.design.patterns;

public abstract class WebPageDecorator implements IWebPage {
  protected IWebPage page;
  
  public WebPageDecorator(IWebPage webpage)
  {
	  this.page = webpage;
  }
  public void display() {
	  this.page.display();
  }
}
