package com.design.patterns;

public class Program {
	public static void main (String argrs [])
	{
		IWebPage myPage = new BasicWebPage();
		myPage = new AuthenticateWebPage(myPage);
		myPage = new AuthorizedWebPage(myPage);		
		myPage.display();
	}
}
