package setSizeAndSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.co.in/");
         Thread.sleep(1000);
      
         System.out.println(driver.manage().window().getPosition());
         Point defaultPosition = driver.manage().window().getPosition();
        System.out.println("Default position is "+defaultPosition);
	 
        //how to set position ?
        
        //1.Create an object of point class and pass X and Y co-ordinates
        
        Point p= new Point(-200,100);
        
        //2. Use setPositionMethod and pass point class object as a parameter
        driver.manage().window().setPosition(p);
	
	
	}
	

}
