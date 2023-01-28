package webElements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		
        Thread.sleep(1000);
      WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
      
   boolean results =getOTPButton.isEnabled();
      
      System.out.println("Current Status is "+results);
      getOTPButton.click();
      Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("7085086561");
     
     if(getOTPButton.isEnabled()) 
     {
      boolean result =getOTPButton.isEnabled();
      
      System.out.println("Current status is "+result);
      getOTPButton.click();
     }
     else {
    	 System.out.println("get otp button is not enabled");
     }
	}

}
