package cbTesting_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class cbTesting {
	
  @Parameters("browserName")
  @Test
  public void CrossBrowser(String browserName) 
  {
	  WebDriver driver= null;
	  if(browserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver =new ChromeDriver();
	  }
	  
	  else if(browserName.equals("fireFox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\chromedriver_win32\\geckodriver.exe");
		  driver =new FirefoxDriver();
	  }
	  driver.manage().window().maximize();
	  driver.get("https://www.neostox.com/");
  }
}
