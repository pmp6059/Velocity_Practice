package webDriver_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

       WebDriver driver=new ChromeDriver(); 
       //Parent p=new Child(Web driver = Parent & Chrome driver= Child)
	   
       //get method
       driver.get("https://paytm.com/");
       driver.get("https://www.google.com/");
       
       
       Thread.sleep(10000);

      // close method
       driver.close();
       Thread.sleep(10000);
       
       //quit method
       driver.quit();
       
     //maximize--minimize method  
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
     
	}

}
