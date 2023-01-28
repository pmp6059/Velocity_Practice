
package dropDown_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Practice2 {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/age-calculator.html");
	Thread.sleep(1000);
	
	 WebElement month = driver.findElement(By.id("today_Month_ID"));
	
          Select s=new Select(month);
          s.selectByVisibleText("Apr");
          
         WebElement day = driver.findElement(By.xpath("(//select[@class='calendarDateInput'])[2]"));
        Select s1 =new Select(day);
        s1.selectByIndex(21);
        Thread.sleep(100);
        
//       WebElement year = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//       Select s2 =new Select(year);
//       s2.selectByIndex(1997);
      
   //Above WebElement year's tagname is input and hence its can not select
    //Exception is UnexpectedTegNameException    
}
}
