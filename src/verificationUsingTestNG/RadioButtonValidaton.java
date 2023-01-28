package verificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonValidaton {
  @Test
  public void ValidateRadioButtonStatus() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
     
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(opt);
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    Thread.sleep(500);
	     
	WebElement RadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]")); 
	WebElement textbox = driver.findElement(By.id("autocomplete"));
    //call method excuteScript
	JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true)", RadioButton);
    RadioButton.click();
    textbox.sendKeys("Praful");
	Assert.assertTrue(RadioButton.isSelected(), "TC is failed");
  }
}
