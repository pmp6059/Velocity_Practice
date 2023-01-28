package webElements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
      
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
	    
	   checkBox1.click();
		
		if(checkBox1.isSelected()) {
			System.out.println("Thank you,check box is already selected");
		}
		
		else {
			System.out.println("Checking check box now");
			//Thread.sleep(10000);
			checkBox1.click();
			
			System.out.println("Check box is selected now");
			
		}
		
	
	
	}

}
