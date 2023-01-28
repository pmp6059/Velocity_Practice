package testNG_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NeoStoxUserIdValidation {
  
	@BeforeClass
	public void launchApplication()
	{
		Reporter.log("Lauching application", true);
	}
	
	@BeforeMethod
	public void logIn()
	{
		Reporter.log("Log in success", true);
	}
	
	@Test
	public void validateUserName()
	{
		Reporter.log("Validating user name", true);
	}
	
	@AfterMethod
	public void logOut()
	{
		Reporter.log("Logging out", true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Closing Browser", true);
	}
	
}
