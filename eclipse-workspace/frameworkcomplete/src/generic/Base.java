package generic;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.maven.surefire.shade.common.org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base implements IAutoConstant{
	
	public static WebDriver driver;
	
	static 
	{
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(IE_KEY, IE_VALUE);	
	}
	
	@BeforeMethod
	public void openApplication() throws FileNotFoundException, IOException
	{
		driver = new FirefoxDriver();
		String url = Lib.getProperty(CONFIG_PATH, "URL");
		driver.get(url);
		String ITO = Lib.getProperty(CONFIG_PATH,"ImplicitTimeOut");
		int timeoutperiod = Integer.parseInt(ITO);
		driver.manage().timeouts().implicitlyWait(timeoutperiod, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.close();
	}
	
	public void takeScreenshot(String testname) throws IOException
	{
		Date d = new Date();
		String currentdate = d.toString().replaceAll(":","_");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\Screenshots\\" + currentdate + "\\" + testname + "_screenshot.png");
		FileUtils.copyFile(srcFile, destFile);
	}
}
