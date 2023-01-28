package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UnOrdered_Practice2 {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	
	WebDriver driver =new ChromeDriver(opt);
	driver.get("https://www.google.com/");
	Thread.sleep(200);
	
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Honda");
	 
	List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
   System.out.println("no of items are "+searchResult.size());
 
   for(WebElement s:searchResult)
   {
	   System.out.println(s.getText());
   }

   for(WebElement bike:searchResult)
   {
	   String expectedResult = "honda unicorn";
   
        String actualText = bike.getText();
   
    if(expectedResult.equals(actualText))
    {
    	bike.click();
    }
   
   }

}
}
