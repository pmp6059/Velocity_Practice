package NeoStoxBaseClass;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import NeoStoxutilityPropertyFile.Utility_PropertyFile;



public class Base 
{
   protected WebDriver driver;
	public void launchBrowser() throws IOException
	{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://neostox.com/");
	    driver.get(Utility_PropertyFile.readDataFromPropertyFile("url"));
		
	   Reporter.log("Launching browser ", true);
	}

}
