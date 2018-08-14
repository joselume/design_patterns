package com.design.patterns;

public class AuthorizedWebPage extends WebPageDecorator{

	public AuthorizedWebPage(IWebPage webpage) {
		super(webpage);
	}
	
	public void authorizedUser()
	{
		System.out.println("Authorizing user");
	}
	
	public void display()
	{
		super.display();
		this.authorizedUser();
	}
}
