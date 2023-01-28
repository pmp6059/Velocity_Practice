package neoStox_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Neostox {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://neostox.com/");
		 Thread.sleep(100);
		 driver.findElement(By.xpath("//input[@type='number']")).sendKeys("7058086561");
		 driver.findElement(By.id("lnk_signup1")).click();
	Thread.sleep(100);
		 driver.findElement(By.id("txt_accesspin")).sendKeys("9463");
		 Thread.sleep(100);
		 driver.findElement(By.xpath("//a[text()='Submit']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
		 Thread.sleep(100);
		 driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
		 Thread.sleep(100);
		 
		 String ActualName = driver.findElement(By.id("lbl_username")).getText();
		  String ExpecteduserName = "Hi";
		  
		  if(ActualName.equals(ExpecteduserName))
		  {
			  System.out.println("Actual and expected username matched. Test case= pass");
		  }
		  else
		  {
			  System.out.println("Actual and expected username matched. Test case= Fail");
		  }
		  Thread.sleep(100);
		  
		 WebElement getValue = driver.findElement(By.xpath("(//div[@class='stx-holder stx-panel-chart'])[1]"));
		  System.out.println("The value is "+getValue.getText());
		  Thread.sleep(100);
		
		  driver.findElement(By.id("lbl_username")).click();
		  Thread.sleep(100);
		  driver.findElement(By.xpath("//span[text()='Logout']")).click();
	    Thread.sleep(100);
	    driver.quit();
	  
	}

}
