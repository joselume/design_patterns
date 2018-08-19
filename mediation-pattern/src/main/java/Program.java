import com.design.patterns.mediatior.impl.AuthenticationDialog;

public class Program {
	public static void main (String [] args) {
		AuthenticationDialog authenticationDialog = new AuthenticationDialog();
		
		authenticationDialog.clickOnloginOrRegisterChkBx();
		authenticationDialog.clickOnOkBtn();
		
		
		authenticationDialog.clickOnloginOrRegisterChkBx();
		authenticationDialog.clickOnOkBtn();
		
	}
}
 