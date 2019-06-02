package pompages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(name="username")
	WebElement unTB;
	
	@FindBy(name="pwd")
	WebElement pwdTB;
	
	@FindBy(id="loginButton")
	WebElement loginBTN;
	
	@FindBy(xpath="//span[@class='errormsg']")
	WebElement errorMsg;
	
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		pwdTB.sendKeys(pwd);
	}
	
	public void clearCredentials()
	{
		unTB.clear();
		pwdTB.clear();
	}
	
	public void clickLogin()
	{
		loginBTN.click();
	}
	
	public boolean errorMsgDisplayed()
	{
		return errorMsg.isDisplayed();
	}
}
