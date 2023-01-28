package dynamicElement;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedLIst {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(500);
		
     List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
      System.out.println("No. of items in list are "+searchResults.size());
      for(WebElement s:searchResults)
      {
      System.out.println(s.getText());
      }
	  
      for(WebElement results:searchResults)
      {
    	  String expected = "honda amaze";
    	  
    	  String actual = results.getText();
    	  
    	  if(expected.equals(actual)) {
    		  System.out.println("clicked on "+results.getText());
    		  results.click();
    		  break;
    	  }
      }
      driver.findElement(By.linkText("Images")).click();
		
	}

}
