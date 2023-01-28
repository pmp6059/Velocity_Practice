package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	 driver.get("https://skpatro.github.io/demo/links/");
	 Thread.sleep(100);
	 
	 driver.findElement(By.name("NewWindow")).click();
	 
	String mainPageId = driver.getWindowHandle();//will return ID of main page
	
	System.out.println("Main Page id "+mainPageId);
	//to get multiple(all page IDs use method getWindowHandles--> will return set of String)
	
	Set<String> idsOfAllPages = driver.getWindowHandles();
	
	   Iterator<String> it = idsOfAllPages.iterator();
	 
	   String mainPageIdnew = it.next();//id of main page
	 
	System.out.println(mainPageIdnew);
	
	   String childPageID = it.next();// id of child page
	   
	   // need to switch selenium focus from main page to child page
	 driver.switchTo().window(childPageID);
	 
	 driver.manage().window().maximize();
	 
	Thread.sleep(0100);
	//writing text to child TextBox
	driver.findElement(By.id("the7-search")).sendKeys("Praful");
	Thread.sleep(100);
	
	driver.close();
	Thread.sleep(100);
	//to work back to main page--> we need to switch selenium focus from child page to main page
	driver.switchTo().window(mainPageIdnew);
	// Switching focus from child page to main page
	Thread.sleep(100);
	
	String myText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
	
	System.out.println("Text on Main Page is "+myText);
}
}
