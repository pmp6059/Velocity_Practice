package neoStox;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateNeoStoxUserNamePractice {
public static void main(String[] args) throws InterruptedException 
{
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://neostox.com/");
	 Thread.sleep(100);
	 
	 driver.findElement(By.id("MainContent_signinsignup_txt_mobilenumber")).sendKeys("7058086561");
	driver.findElement(By.id("lnk_signup1")).click();
	Thread.sleep(100);
	
	driver.findElement(By.id("txt_accesspin")).sendKeys("9463");
	driver.findElement(By.id("lnk_submitaccesspin")).click();
	
}
}
