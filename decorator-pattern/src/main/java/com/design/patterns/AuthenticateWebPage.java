package com.design.patterns;

public class AuthenticateWebPage extends WebPageDecorator {

	public AuthenticateWebPage(IWebPage webpage) {
		super(webpage);
	}
	public void authenticateUser()
	{
		System.out.println("Authenticating user");
	}
	public void display()
	{
		super.display();
		this.authenticateUser();
	}
}
