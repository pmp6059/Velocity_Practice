package chromeOptions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ArgumentsOfChromeOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
	 ChromeOptions opt=new ChromeOptions();
	 opt.addArguments("--start-maximized");
	// opt.addArguments("--incognito");
	// opt.addArguments("disable-infobars");
	 opt.addArguments("--disable-popup-blocking");
	 opt.addArguments("--version");
	// opt.addArguments("--headless");
	 opt.addArguments("--disable-infobars");
	 
	 
	 ArrayList<String>al =new ArrayList<>();
	 al.add("--version");
	 opt.addArguments(al);
	 
	 
		WebDriver driver =new ChromeDriver(opt);
        driver.get("https://www.justdial.com/");
        Thread.sleep(100);
        
        String myTxt = driver.findElement(By.xpath("//span[text()='Popular Services ']")).getText();
        System.out.println("The text is "+myTxt);
        
       driver.findElement(By.id("srchbx")).sendKeys("pizza");
       driver.findElement(By.xpath("//span[@id='srIconwpr']")).click();
        
	}

}
