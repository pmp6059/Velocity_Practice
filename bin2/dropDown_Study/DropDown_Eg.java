package dropDown_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Eg {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	
    driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
	Thread.sleep(1000);
	
	//handling date
	//1.Identify list box to be handled and store it in reference variable
	WebElement day = driver.findElement(By.id("day"));
	
	//2.Create of an object of select class which will accept Webelement as an argument
	Select s=new Select(day);
	
	 //3. By using one of the select class methods we can select values from list box life
    //1.selectByVisibleText:selectByVisibleText(String arg0)
    //2.selectByIndex:selectByIndex(int arg0)
    //3.selectByValue:selectByValue(String are0)
	
	s.selectByVisibleText("22");
	
	//Handling Month
	WebElement month = driver.findElement(By.id("month"));
	Select s1=new Select(month);
    
	s1.selectByVisibleText("Apr");
	
	//Handling Year
	WebElement year = driver.findElement(By.id("year"));
	Select s2=new Select(year);
	s2.selectByValue("1997");
	
	System.out.println("Year multiselection is "+s2.isMultiple());
}
}
