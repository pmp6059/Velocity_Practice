package dropDown_Study;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection_DropDown {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
    driver.get("https://output.jsbin.com/osebed/2");
	Thread.sleep(1000);
	
	//Process to handle list box /dropdown (verify tag name of dropdown/list box is s)
	
	//1. Identify list box to be handed and store it in reference variable

	 WebElement fruits=driver.findElement(By.id("fruits"));
    
   
	//2.Create an object of Select class which will accept WebElement as arguments
    Select s=new Select(fruits);
    
    //3. By using one of the select class methods we can select values from list box life
    //1.selectByVisibleText:selectByVisibleText(String arg0)
    //2.selectByIndex:selectByIndex(int arg0)
    //3.selectByValue:selectByValue(String are0)
    
    //check that is it multi selectable?
    System.out.println("Multiselection Status is "+s.isMultiple());
    
    s.selectByVisibleText("Banana");
    Thread.sleep(100);
    s.selectByValue("orange");
    Thread.sleep(100);
    s.selectByIndex(1);
    
    
    
       List<WebElement> allOptions = s.getAllSelectedOptions();
          
        Iterator<WebElement> it = allOptions.iterator();
         
        while(it.hasNext())
        {
        	System.out.println(it.next().getText());
        }
       System.out.println("=============================");  
       System.out.println("===for loop=================");
        
       for(int i = 0;i<=allOptions.size()-1;i++)
       {
    	   System.out.println(allOptions.get(i).getText());
       }
       
       System.out.println("=====for Each================");  
         
        for(WebElement a:allOptions) {
        	System.out.println(a.getText());
        }
  
}
}
