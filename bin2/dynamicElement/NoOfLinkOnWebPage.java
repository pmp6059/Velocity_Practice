package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinkOnWebPage {

	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			
	    WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.co.in/");
        Thread.sleep(1000);
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("No of links are "+links.size());
        
        //What are those links?
        
        for(WebElement l:links) 
        {
        	System.out.println(l.getText());
        } 
	}

}
