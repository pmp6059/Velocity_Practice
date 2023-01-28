package neoStoxPOMClassesUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateNeoStoxUserName 
{
	WebDriver driver;
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pass;
	NeoStoxDashBoardPage dash;
	File myFile;
	Sheet mySheet;
	
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://neostox.com/");
		 Reporter.log("Launching NepStox app", true);
		 
		 home = new NeoStoxHomePage(driver);
		 signIn =new NeoStoxSignInPage(driver);
		 pass =new NeoStoxPasswordPage(driver);
		 dash =new NeoStoxDashBoardPage(driver);
		 
		 myFile =new File("C:\\Users\\HP\\Documents\\Book5.xlsx");
		 mySheet=WorkbookFactory.create(myFile).getSheet("Sheet5");
	}
	
	
	@BeforeMethod
	public void logInToNeoStox() throws InterruptedException
	{
		home.clickOnSubmitButton();
		Reporter.log("Clicking on sign button", true);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		signIn.enterMobNum(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Entering mobile number", true);
		signIn.clickOnSignInButton();
		Reporter.log("CLicking on submit button", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pass.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
	    Reporter.log("Entering password", true);
	    Thread.sleep(100);
	    pass.clickOnSubmitButton();
	   // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	    
	    dash.handlePopUp();
	    Reporter.log("Handling pop up", true);
	  //  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
  @Test
  public void validateUserName()
  {
	  String expectedUserName = mySheet.getRow(0).getCell(2).getStringCellValue();
	  String actualUserName = dash.getActualUserName();
	  Reporter.log("Validating username", true);
	  Assert.assertEquals(actualUserName, expectedUserName,"Actual and expected user name not matched, TC failed");
  }
  
  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException
  {
	  Thread.sleep(100);
	  dash.logOutFromNeoStox();
	  Reporter.log("log out from neostox",true);
	  
  }
  
  @AfterClass
  public void closeBrowser() 
  {
	driver.close();
	Reporter.log("Closing browser", true);
  }
}

