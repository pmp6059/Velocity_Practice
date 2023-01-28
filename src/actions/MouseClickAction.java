package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseClickAction 
{
public static void main(String[] args) throws InterruptedException 
{
   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
   Thread.sleep(100);
   
   WebElement signInButton = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
   
   //	1.Create an object of Action class and pass WEBDRIVER object as parameter
   
   Actions act =new Actions(driver);
   
   //2.Using one the Action class method take required Action.
   // act.click(signInButton).perform();
   
   act.moveToElement(signInButton).click().perform();
   
   Thread.sleep(1000);
   
  WebElement day = driver.findElement(By.id("day"));
   
   Select s =new Select(day);
   s.selectByVisibleText("22");
  
   WebElement month = driver.findElement(By.id("month")); 
   Select s2 =new Select(month);
   s2.selectByVisibleText("Apr");
   
   WebElement year = driver.findElement(By.id("year"));
   Select s3 =new Select(year);
   s3.selectByValue("1997");
   
   System.out.println("Multiselection status is "+s3.isMultiple());

   Thread.sleep(1000);
   WebElement signUp = driver.findElement(By.xpath("(//button[contains(@class,'_6j mvm _6wk ')])[1]"));
   act.moveToElement(signUp).click().perform();
   
}
}
