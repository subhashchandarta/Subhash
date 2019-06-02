package pompages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(xpath="//a[@class='logout']")
	WebElement logoutLink;
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean logoutDisplayed() 
	{
		return logoutLink.isDisplayed();
	}
	
	public void clickLogout()
	{
		logoutLink.click();
	}
}
