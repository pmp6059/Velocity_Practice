package dropDown_Study;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelected_Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		Thread.sleep(100);
		
		WebElement multipleSelect = driver.findElement(By.id("fruits"));
		
       Select s =new Select(multipleSelect);
       
       System.out.println("Mulitselection status is "+s.isMultiple());
       s.selectByIndex(0);
       s.selectByValue("apple");
       s.selectByVisibleText("Grape");
       
      List<WebElement> allSelected = s.getAllSelectedOptions();
      
     Iterator<WebElement> it = allSelected.iterator();
      
     while (it.hasNext())
     {
    	 System.out.println(it.next().getText());
     }
     
     Thread.sleep(200);
     
     s.deselectByIndex(0);
    s.deselectByValue("apple");
    s.deselectByVisibleText("Grape");
     
         
    
       
	}

}
