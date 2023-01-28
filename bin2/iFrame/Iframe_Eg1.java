package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Eg1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/guru99home/");
	Thread.sleep(100);
	
	driver.switchTo().frame("a077aa5e");//switching the frame by id
	
System.out.println("Switching to the iframe");
	
	driver.findElement(By.xpath("/html/body/a/img")).click();//clicks the iframe
	
	System.out.println("we are done");
	
	
	
	
	
	
	
}
}
