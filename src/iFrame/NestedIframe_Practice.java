package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframe_Practice {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(100);
		
		driver.switchTo().frame("frame1");
		Thread.sleep(500);
		driver.findElement(By.tagName("input")).sendKeys("Praful");
		Thread.sleep(500);
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
	
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		animals.click();
		
		Select s=new Select(animals);
		
		System.out.println("Multi selection status is "+s.isMultiple());
		
		
		//s.selectByValue("babycat");
		s.selectByVisibleText("Big Baby Cat");
		
		
	}

}
