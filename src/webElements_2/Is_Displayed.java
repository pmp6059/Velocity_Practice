package webElements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {

	public static void main(String[] args) throws InterruptedException {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
       
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	 WebElement textBox = driver.findElement(By.name("show-hide"));
		 
		textBox.sendKeys("Good Evening");
		
		Thread.sleep(1000);
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		
		Thread.sleep(1000);
		
		if(textBox.isDisplayed()) {
			textBox.sendKeys("Hello");
		}
		else {
			driver.findElement(By.id("show-textbox"));
			textBox.sendKeys("Bye");
		}
	}
}
