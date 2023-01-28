package NeoStoxBase_Property;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import NeoStoxutilityPropertyFile.Utility_PropertyFile;

public class Base_Property 
{
	protected WebDriver driver;
	
	public void launchNeo() throws IOException
	{
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get(Utility_PropertyFile.readDataFromPropertyFile("url"));
	  Reporter.log("Launch to neo", true);
	  
	}
}
