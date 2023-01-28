package testNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex1TestNG {
  @Test   //this for method/test case
  
  public void KiteLogIn() 
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 
		 System.out.println("Hii this is printing statement");//its visible only on console window
		 
		 //Visible only on Emailable report
		 Reporter.log("Hii this reporter statement visible only on Emailable report.");
		
		 //Visible on both Console window and Emailable report
		 Reporter.log("Hiii", true);
  }
}
