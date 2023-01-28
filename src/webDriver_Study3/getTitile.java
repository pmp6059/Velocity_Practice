package webDriver_Study3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitile {

	public static void main(String[] args) throws InterruptedException {
       
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver =new ChromeDriver();
       
       
       
       //getTitle
       driver.get("https://paytm.com/");
       Thread.sleep(500);
       
       String Title= driver.getTitle();
       System.out.println("Title is "+Title);
	
	   // getCurrent URL
       
       driver.get("https://paytm.com/");
       Thread.sleep(300);
       
       String url= driver.getCurrentUrl();
       System.out.println("URL is "+url);
	
	}
}

