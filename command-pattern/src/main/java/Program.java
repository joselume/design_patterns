import com.design.patterns.client.Application;

public class Program {
	// The Button is the invoker. The command that is going to be executed by the
	// Button is injected to it, so the Button doesn't know with commands will be excecuted.
	// In this way the developer can build the button without worrying about the business logic,
	// and the Button will be used from whatever context.
	
	public static void main (String [] args)
	{
		Application app = new Application();
		app.createUI();
		app.clickOnCopyButton();
		app.clickOnCutButton();
		app.clickOnPasteButton();
		app.clickOnUndoButton();		
	}
}
