package chromeOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Practice
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
	ChromeOptions opt =new ChromeOptions();
	opt.addArguments("--start-maximized");
	opt.addArguments("--disable-popup-blocking");
	//opt.addArguments("--version");
	
	
	WebDriver driver =new ChromeDriver(opt);
	driver.get("https://www.google.com/");
	 Thread.sleep(100);
	 
	 String text = driver.findElement(By.xpath("(//input[@type='submit'])[2]")).getText();
	 System.out.println("The text is "+text);
}

}
