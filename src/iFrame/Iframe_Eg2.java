package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Eg2 {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	Thread.sleep(1000);
	//To handle iframe we have to switch focus of selenium from main page to iframe.
	
  //Switching focus from main page to iframe
    driver.switchTo().frame("iframeResult");
    
    //This element is inside iframe.
    driver.findElement(By.xpath("//button[@type='button']")).click();
  
  //now we try to switch focus from iframe to main page.
    
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
  
  
  
  
  
  
  }
}
