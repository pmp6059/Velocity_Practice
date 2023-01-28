package NeoStoxutilityPropertyFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NeoStoxBase_Property.Base_Property;


public class ValidateTestCases extends Base_Property {
 
	NeoHome home;
	NeoSignIn signIN;
	NeoPassword pass;
	NeoDashBoard dash;
	
	
	@BeforeClass
	public void launchStox() throws IOException
	{
		launchNeo();
		home =new NeoHome(driver);
		signIN =new NeoSignIn(driver);
		pass =new NeoPassword(driver);
		dash =new NeoDashBoard(driver);
		
		
	}
	
	@BeforeMethod
	public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		home.clickOnSignInButton();
		Utility_PropertyFile.impWait(1000, driver);
	
		signIN.enterMobNum(Utility_PropertyFile.readDataFromPropertyFile("mobNum"));
		Thread.sleep(1000);
		signIN.clickOnSignInButton();
		Utility_PropertyFile.impWait(1000, driver);
		
		
		pass.enterPassword(Utility_PropertyFile.readDataFromPropertyFile("password"));
		pass.clickOnSubmitButton();
		
	  // Utility_PropertyFile.impWait(1000, driver);
		//Thread.sleep(500);
		dash.handlePopUp(driver);
	}
	
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException
  {
	  Assert.fail();
	  Assert.assertEquals(dash.getActualUserName(), Utility_PropertyFile.readDataFromPropertyFile("actualUserName"),"Actaula nd exp names not matching TC failed");
      Utility_PropertyFile.takesScreenshot(driver, Utility_PropertyFile.readDataFromPropertyFile("scr"));
  }

  @Test
  public void validataAcBalance() throws IOException
  {
	  Assert.assertNotNull(dash.getAcBalance(), "Ac balance is null TC failed");
	  Utility_PropertyFile.takesScreenshot(driver, Utility_PropertyFile.readDataFromPropertyFile("scr2"));
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
	  Thread.sleep(1000);
  }

}
