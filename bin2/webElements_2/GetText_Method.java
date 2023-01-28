package webElements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Method {

	public static void main(String[] args) throws InterruptedException
	{
   System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
  //  driver.manage().window().maximize();
    driver.get("https://paytm.com/");
    Thread.sleep(1000);
  String actualText = driver.findElement(By.xpath("//div[contains(text(),'Recharge & pay bills, book flights & movie tickets, ')]")).getText();
  String expectedText = "Recharge & pay bills, book flights & movie tickets, open a savings account, invest in stocks & mutual funds, and do a lot more.";
 
  System.out.println("Actual text is "+actualText);
  if (actualText.equals(expectedText)) {
	  System.out.println("Text is matching TC is passed");
  }
  else {
	  System.out.println("Text is not matching TC is failed");
  }
	}

}
