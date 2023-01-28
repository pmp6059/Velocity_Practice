package neoStox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://neostox.com/");
		 Thread.sleep(100);
		 
		 //Create object of Home Page
		 NeoStoxHomePage home =new NeoStoxHomePage(driver);
		  
		 home.clickOnSignButton();
		 
	}

}
