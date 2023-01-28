package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrdered_Practice3
{public static void main(String[] args) throws InterruptedException {
	 
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	
	
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("oppo mobiles");
	 Thread.sleep(200);
	 
	 List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	 
	 System.out.println("No of links are "+searchResult.size());
	 
	 for(WebElement mobile:searchResult)
	 {
		 System.out.println(mobile.getText());
	 }
	 
	 for(WebElement s:searchResult)
	 {
		 String expectedText = "oppo mobiles 5g";
		 String actualText = s.getText();
		 
		 if(expectedText.equals(actualText))
		 {
			 System.out.println("Clickedn on "+s.getText());
			 s.click();
			 break;
		 }
	 }
}

}
