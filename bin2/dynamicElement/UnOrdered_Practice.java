package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UnOrdered_Practice {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	
	WebDriver driver =new ChromeDriver(opt);
	driver.get("https://www.google.com/");
	
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mahindra car's");
	 Thread.sleep(500);
	List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
	System.out.println("no. of items "+searchResult.size());
	
	System.out.println("===========for each====");
	
	for(WebElement car:searchResult)
	{
	   System.out.println(car.getText());	
	}
	
	
	
	for(WebElement result:searchResult)
	{
		String expectedText = "mahindra cars 7 seater";
		
		String actual = result.getText();
		
		if(expectedText.equals(actual))
		{
			System.out.println("Clicked on "+result.getText());
			result.click();
			break;
		}	
	}
	
	driver.findElement(By.xpath("//h3[text()='Mahindra 7 Seater Cars in India - CarDekho']")).click();
}
}

