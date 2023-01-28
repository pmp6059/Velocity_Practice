package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_IntoView {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
       driver.get("https://en.wikipedia.org/wiki/India");
       Thread.sleep(1000);
       driver.manage().window().maximize();
       
       //decide where to scroll and store in ref variable
       WebElement ancient_India = driver.findElement(By.id("Ancient_India"));
       
       //type cast driver object into JavascriptExecuter
       
       JavascriptExecutor js= (JavascriptExecutor)driver;
       
       //call method excuteScript
       Thread.sleep(1000);
       js.executeScript("arguments[0].scrollIntoView(true)", ancient_India);
       
   
       
       
       
       
       
       
       
	}

}
