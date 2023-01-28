package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUps
{public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(100);
	 
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 Thread.sleep(100);
	// driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9403100230");
	 Thread.sleep(100);
	 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone14");
	 Thread.sleep(100);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
	 
	 
	 
	 
	 
	 
	 
}

}
