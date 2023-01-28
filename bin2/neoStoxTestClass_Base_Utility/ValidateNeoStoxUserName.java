package neoStoxTestClass_Base_Utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NeoStoxBaseClass.Base;
import neoStoxPOMClass_Base_Utility.NeoStoxDashBoardPage;
import neoStoxPOMClass_Base_Utility.NeoStoxHomePage;
import neoStoxPOMClass_Base_Utility.NeoStoxPasswordPage;
import neoStoxPOMClass_Base_Utility.NeoStoxSignInPage;
import neoStoxUtility.Utility;

public class ValidateNeoStoxUserName extends Base
{
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pwd;
	NeoStoxDashBoardPage dash;
	String s="TCID=123";
	
	@BeforeClass
	public void launchNeoStox() throws IOException {
		
		home =new NeoStoxHomePage(driver);
		signIn =new NeoStoxSignInPage(driver);
		pwd =new NeoStoxPasswordPage(driver);
		dash =new NeoStoxDashBoardPage(driver);
		
		launchBrowser();
	}
	
	@BeforeMethod
	public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		home.clickOnSignInButton();
		Utility.implicitWait(1000, driver);
	
		signIn.enterMobNum(Utility.readDataFromExcel(0, 0));
		Thread.sleep(100);
		signIn.clickOnSignInButton();
		
		Utility.implicitWait(1000, driver);
		pwd.enterPassword(Utility.readDataFromExcel(0, 1));
		pwd.clickOnSubmitButton();
		
		Utility.implicitWait(1000, driver);
		dash.handlePopUp();
	}
	
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(dash.getActualUserName(), Utility.readDataFromExcel(0, 2),"Actaula nd exp names not matching TC failed");
     Utility.takesScreenShot(driver, s);
  }
  
  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException
  {
	  dash.logOutFromNeoStox();
  }
  
  @AfterClass
  public void closeNeoStoxApp() throws InterruptedException
  {
	  driver.close();
	  Reporter.log("Closing application", true);
	  Thread.sleep(500);
  }
}
