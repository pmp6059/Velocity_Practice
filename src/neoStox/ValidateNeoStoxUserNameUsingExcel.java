package neoStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
       //Validate user name by using Excel sheet

public class ValidateNeoStoxUserNameUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();

		 //reading data from excel
		 File myFile =new File("C:\\Users\\\\HP\\Documents\\Book5.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
	    // double mobNum = mySheet.getRow(0).getCell(0).getNumericCellValue();
		 //double password = mySheet.getRow(0).getCell(1).getNumericCellValue();
	     String expUN = mySheet.getRow(0).getCell(2).getStringCellValue();
		 
	    //launch neoStox url
	    driver.get("https://neostox.com/");
		Thread.sleep(100);
		 
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		Thread.sleep(1000);
		
		//Working on signIn page
		//1.Sending mobile number
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("7058086561");
	
		//2.clicking on signIn button
		driver.findElement(By.id("lnk_signup1")).click();
		Thread.sleep(1000);
		
		//Working on password page
		//1.Entering password
		driver.findElement(By.id("txt_accesspin")).sendKeys("9463");
		//2.Clicking on Submit Button
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		//Working on Home Page
		//Handling Hidden div popup
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
		Thread.sleep(1000);
		
		//Validating User name
		
		String actualUserName = driver.findElement(By.id("lbl_username")).getText();
		//String expected username
		
		if(actualUserName.equals(expUN))
		{
			System.out.println("Actual and expected user name match, Test case is pass");
		}
		else {
			System.out.println("Actual and expected user name does not match, Test case is fail");
		}
       
		Thread.sleep(1000);
		driver.findElement(By.id("lbl_username")).click();
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		driver.close();
		
	}

}
