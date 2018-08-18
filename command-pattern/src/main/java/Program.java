import com.design.patterns.client.Application;

public class Program {
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
