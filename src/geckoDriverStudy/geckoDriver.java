package geckoDriverStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class geckoDriver {
  @Test
  public void fireFoxStudy() 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\chromedriver_win32\\geckodriver.exe");
		 
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://neostox.com/");  
  }

}