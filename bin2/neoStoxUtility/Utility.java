package neoStoxUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {

	public static String readDataFromExcel(int row ,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile= new File("C:\\Users\\HP\\Documents\\Book5.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("Reading data from excel is "+row+"Cell is "+cell, true );
		Reporter.log("data is "+value, true);
		return value ;
		
	}
	
	public static void implicitWait(int time, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("Waitingfor "+time+"ms", true);
	}
	
	
	public static void takesScreenShot(WebDriver driver, String fileName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\chromedriver_win32\\Screenshot\\"+fileName+".png");
		FileHandler.copy(src, dest);
		Reporter.log("Taking ScreenShot", true);
		Reporter.log("Taking screenshot and saved at "+dest, true);
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView", element);
	    Reporter.log("Scrolling into view to"+element.getText(), true);
	}
	
	
}
