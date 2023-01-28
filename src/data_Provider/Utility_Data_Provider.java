package data_Provider;

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

public class Utility_Data_Provider
{
//	public static String readURLFromPropertyfile(String key) throws IOException
//	{
//	Properties prop =new Properties();
//	
//	FileInputStream myFile =new FileInputStream("C:\\Users\\HP\\eclipse-workspace3\\Selenium_New\\20Aug_Property.properties");
//	prop.load(myFile);
//	String value = prop.getProperty(key);
//	return value;
//	}
//	
public static void implicitWait(int time , WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		
	}
//	
//	public static void takesScreenshot(WebDriver driver , String fileName) throws IOException
//	{
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest= new File("C:\\chromedriver_win32\\Screenshot\\"+fileName+".png");
//		FileHandler.copy(src, dest);
//		
//	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
	}

}
