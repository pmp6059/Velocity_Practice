package webDriver_Study2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {
	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 //navigate method
     driver.get("https://www.facebook.com/");
     Thread.sleep(100);
     
     driver.navigate().to("https://www.google.com/");
     Thread.sleep(300);
     
     driver.navigate().back();
     Thread.sleep(500);
     
     driver.navigate().forward();
     Thread.sleep(500);
     
     driver.navigate().refresh();
     Thread.sleep(500);
	}

}
