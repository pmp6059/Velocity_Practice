package neoStox_Listener;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class Base_Listener 
{
	 protected static WebDriver driver;
 public void launchBrowser() throws IOException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 driver =new ChromeDriver();
	driver.get(Utility_Listener.readDataFromPropertyfile("url"));
	Reporter.log("Launch to neoStox", true);
 }
	
}
