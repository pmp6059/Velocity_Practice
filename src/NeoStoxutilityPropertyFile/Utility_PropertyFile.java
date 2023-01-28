package NeoStoxutilityPropertyFile;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility_PropertyFile 
{
 public static String readDataFromPropertyFile(String key) throws IOException 
 {
	 //1.Creater object of property file
	 Properties prop =new Properties();
	 
	 //2.create object of fileInputStram
	 FileInputStream myFile =new FileInputStream("C:\\Users\\HP\\eclipse-workspace3\\Selenium_New\\20Aug_Property.properties");
	 
	 //3. Load File
	 prop.load(myFile);
	 
	
	//4.read data from property file
	 String value = prop.getProperty(key);
	 Reporter.log("Reading data from property file", true);
	 Reporter.log("data is "+value, true);
	 
	return value;
	
 }
 
 public static void impWait(int time , WebDriver driver)
 {
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
    Reporter.log("Waiting for"+time+"ms", true);
 }
 
 public static void takesScreenshot(WebDriver driver, String fileName) throws IOException
 {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      File dest =new File("C:\\chromedriver_win32\\Screenshot\\"+fileName+".png");
      FileHandler.copy(src, dest);
      Reporter.log("Screenshot takes and saved at "+dest, true);
 }
 
 public static void scrollIntoView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("Scrolling to "+element.getText(), true);
	}
	 
}
