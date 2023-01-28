package neoStoxPOMClassesUsingDDF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ValidateUserNeoStoxNameUsingGeneralMethods {
	
	WebDriver driver;
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pwd;
	NeoStoxDashBoardPage dash;
	String s="TCID=123";
	
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		GeneralMethods.implicitWait(1000, driver);
		Reporter.log("Launching neostox", true);
		
		home =new NeoStoxHomePage(driver);
		signIn =new NeoStoxSignInPage(driver);
		pwd =new NeoStoxPasswordPage(driver);
		dash =new NeoStoxDashBoardPage(driver);
		
		
	}
	
	@BeforeMethod
	public void logInToNeoStoxapp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		home.clickOnSubmitButton();
		
		signIn.enterMobNum(GeneralMethods.readDataFromExcel(0, 0));
		signIn.clickOnSignInButton();
		
		pwd.enterPassword(GeneralMethods.readDataFromExcel(0, 1));
		Thread.sleep(100);
		pwd.clickOnSubmitButton();
		
		
		dash.handlePopUp();
		
		
	}
	
	
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(dash.getActualUserName(), GeneralMethods.readDataFromExcel(0, 2),"TC failed");
       GeneralMethods.takesScreenshot(driver, s);
	  
  }
  
  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException
  {

	 dash.logOutFromNeoStox();
	 
  }
 @AfterClass
 public void closeBrowser() {
	   driver.close();
 }
}
