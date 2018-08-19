package com.design.patterns.mediatior.impl;

import com.design.patterns.component.Component;
import com.design.patterns.component.impl.Button;
import com.design.patterns.component.impl.Checkbox;
import com.design.patterns.component.impl.Textbox;
import com.design.patterns.mediatior.Mediator;

public class AuthenticationDialog implements Mediator {

	private String title;
    private Checkbox loginOrRegisterChkBx;
    private Textbox loginUsername, loginPassword; 
    private String registrationUsername, registrationPassword;
    private Textbox registrationEmail;
    private Button okBtn, cancelBtn;
            
    public void clickOnloginOrRegisterChkBx() {
    	loginOrRegisterChkBx.click();
    }
    public void clickOnOkBtn() {
    	okBtn.click();
    }
        
    // The concrete mediator class. All chaotic communications
    // between concrete components were extracted to the mediator
    // class.
	public void notify(Component sender, String event) {

        if (sender == loginOrRegisterChkBx && event == "check") {
            if (loginOrRegisterChkBx.isChecked()) {
                title = "Log in";
                System.out.println("\nLog in");
        		System.out.println("1. Show login form components.");
        		System.out.println("2. Hide registration form components.");
			}
            else {
                title = "Register";
                System.out.println("\nRegister");
                System.out.println("1. Show registration form components");
                System.out.println("2. Hide login form components");
            }
		}
        if (sender == okBtn && event == "click")
            if (loginOrRegisterChkBx.isChecked()) {
            	System.out.println("\nTry to find a user using login credentials.");
            	boolean found = true;
                if (!found) {
                	System.out.println("Show an errors above login fields.");                	
                }
            } 
            else {
            	System.out.println("\n1. Create the user account using data from the registration fields.");
            	System.out.println("2. Log that user in.");            	
            }
	}
	
	// Create all component objects and pass the current
    // mediator into their constructors to establish a link.
	public AuthenticationDialog () {
		String title = "Title dialog";
	    loginOrRegisterChkBx = new Checkbox(this);
	    loginUsername = new Textbox(this);	    
	    loginPassword = new Textbox(this);	    
	    String registrationUsername = "joseluis";
	    String registrationPassword = "password";
	    registrationEmail = new Textbox(this);
	    okBtn = new Button(this);
	    cancelBtn = new Button(this);
	}

}
