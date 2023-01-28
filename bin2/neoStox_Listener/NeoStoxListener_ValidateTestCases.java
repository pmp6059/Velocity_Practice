package neoStox_Listener;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(NeoStoxListener_Listener.class)
public class NeoStoxListener_ValidateTestCases extends Base_Listener implements ITestListener
{
	NeoStoxListenerHomePage home;
	NeoStoxListener_SignIn signIN;
	NeoStoxListener_Password pass;
	NeoStoxListener_DashBoard dash;
	
	
	@BeforeClass
	public void launchBeoStoxApp() throws IOException
	{
		home =new NeoStoxListenerHomePage(driver);
		signIN=new NeoStoxListener_SignIn(driver);
	   pass =new NeoStoxListener_Password(driver);
	    dash =new NeoStoxListener_DashBoard(driver);
	    
	    launchBrowser();
	    
	}
	
	@BeforeMethod
	public void logInNeoStox() throws InterruptedException, IOException
	{
		home.clickOnSignInButton();
		Utility_Listener.implicitWait(1000, driver);
	
		signIN.enterMobNum(Utility_Listener.readDataFromPropertyfile("mobNum"));
		Thread.sleep(1000);
		signIN.clickOnSignInButton2();
		
		Utility_Listener.implicitWait(1000, driver);
		pass.enterPassword(Utility_Listener.readDataFromPropertyfile("password"));
		pass.clickOnSubmitButton();
		
		Utility_Listener.implicitWait(1000, driver);
		dash.handlePopUp(driver);
	}
  @Test
  public void validateUserName() throws IOException
  {
	  Assert.fail();
	  Assert.assertEquals(dash.getActualUserName(),Utility_Listener.readDataFromPropertyfile("actualUserName"),"Acual and expected are not matching, TC is failed");
 
  }
  
  @Test
  public void validateAcBalance()
  {
	  Assert.assertNull(dash.getAcBalance(),"AC balance is not null, TC failed");
  }
  
  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException
  {
	 dash.logOutFromNeoStox();
	 
  }
  
  @AfterClass
  public void closeApp() throws InterruptedException
  {
	  driver.close();
	  Reporter.log("Closing application", true);
     Thread.sleep(200);
  }
  
}
