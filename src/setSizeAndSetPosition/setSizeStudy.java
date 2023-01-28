package setSizeAndSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSizeStudy {
	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.co.in/");
         Thread.sleep(1000);
         
         //how to get default size of browser?
         System.out.println(driver.manage().window().getSize());
	    Dimension defaultSize = driver.manage().window().getSize();
	    System.out.println("Default Size is "+defaultSize);
	     
	    //how to set size?
	   //1.Create object dimension class and pass values of width and height
	    Dimension d=new Dimension(555,400);
	   Thread.sleep(100);
	   
	   //2.use setSize method nad pass Dimension clss's object as a parameter
	
	   driver.manage().window().setSize(d);
	   Dimension newSize = driver.manage().window().getSize();
	   System.out.println("New size is "+newSize);
	
	}
}
