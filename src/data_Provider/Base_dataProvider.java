package data_Provider;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;



public class Base_dataProvider
{
	 protected static WebDriver driver;
	 public void launchBrowser() throws IOException
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://neostox.com/");
		Reporter.log("Launch to neoStox", true);
	 }

}
