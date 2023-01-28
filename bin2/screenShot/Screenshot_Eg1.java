package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Eg1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://paytm.com/");
	
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
	  System.out.println("Current location is "+src);
	
	  File destinaiton=new File("C:\\chromedriver_win32\\Screenshot\\Screenshot1.jpeg");
	  FileHandler.copy(src, destinaiton);
  
}
}
