package webElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
     
	 WebDriver driver=new ChromeDriver();
     
	 driver.get("https://vctcpune.com/selenium/practice.html");
	 driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello");
	  
	 driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
	 
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Got it");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
	 
	 Thread.sleep(1000);
	 
	driver.findElement(By.xpath("//a[text()='HOME ']")).click();
	 

	}

}
