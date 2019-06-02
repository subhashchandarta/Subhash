package scripts;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import generic.Base;
import generic.Lib;
import pompages.Home;
import pompages.Login;

public class TestLogin extends Base{
	
	@Test
	public void testLogin() throws EncryptedDocumentException, FileNotFoundException, IOException, InvalidFormatException
	{
		Login l = new Login(driver);
		Home h = new Home(driver);
		int rowcount = Lib.getRowCount(EXCEL_PATH,"Login");
		for(int i=1; i<=rowcount; i++) 
		{
		String un = Lib.getCellValue(EXCEL_PATH, "Login", i, 0);
		String pwd = Lib.getCellValue(EXCEL_PATH, "Login", i, 1);
		System.out.println(un + " - " + pwd);
		l.setUsername(un);
		l.setPassword(pwd);
		l.clickLogin();
		
		String actTitle = driver.getTitle();
		String expTitle = "actiTIME - Enter Time-Track";
		if(actTitle.equals(expTitle))
		{
			System.out.println("Loggedin correctly");
			h.clickLogout();
		}
		else
		{
			System.out.println("Username/Password mismatch");
			l.clearCredentials();
		}
		
		/*boolean logoutDisplayed = h.logoutDisplayed();
		boolean errorMsgDisplayed = l.errorMsgDisplayed();
		if(logoutDisplayed)
		{
			System.out.println("Loggedin correctly");
			h.clickLogout();
		}
		else if(errorMsgDisplayed)
		{   
			System.out.println("Username/Password mismatch");
			l.clearCredentials();
		}*/
	 }
   }
}
