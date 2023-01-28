package data_Provider;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;






public class DataProvider_ValidateTC extends Base_dataProvider
{
	data_ProviderHomePage home;
	data_ProviderSignIn signIn;
	Password_DataProvider pass;
	DashBoard_DataProvider dash;
	
@BeforeMethod
public void launchNeoStox() throws IOException
{
	launchBrowser();
	
	home=new data_ProviderHomePage(driver);
	signIn =new data_ProviderSignIn(driver);
	pass =new Password_DataProvider(driver);
	dash =new DashBoard_DataProvider(driver);
	
}

@Test(dataProvider ="logInDetailsForValidateUserName")
public void validateUserName(String mobNum,String password,String userName) throws InterruptedException, IOException
{
	home.clickOnSignInButton();
	Utility_Data_Provider.implicitWait(1000, driver);

	Thread.sleep(1000);
	signIn.enterMobNum(mobNum);
	signIn.clickOnSignInButton2();
	
	Thread.sleep(1000);
	Utility_Data_Provider.implicitWait(1000, driver);
	pass.enterPassword(password);
	pass.clickOnSubmitButton();
	
	
	Utility_Data_Provider.implicitWait(1000, driver);
	dash.handlePopUp(driver);
	
	Assert.assertEquals(dash.getActualUserName(),userName ,"Actual and Exp user Name are not matching, TC failed");
    dash.logOutFromNeoStox();
}

@Test(dataProvider ="logInDetailsForValidateACbalance")
public void validateACbalance(String mobNum,String password,String userName) throws InterruptedException, IOException
{
	home.clickOnSignInButton();
	Utility_Data_Provider.implicitWait(1000, driver);

	Thread.sleep(1000);
	signIn.enterMobNum(mobNum);
	signIn.clickOnSignInButton2();
	
	Thread.sleep(1000);
	Utility_Data_Provider.implicitWait(1000, driver);
	pass.enterPassword(password);
	pass.clickOnSubmitButton();
	
	
	Utility_Data_Provider.implicitWait(1000, driver);
	dash.handlePopUp(driver);
	
	Assert.assertEquals(dash.getAcBalance(),"Actual and Exp user Name are not matching, TC failed");
    dash.logOutFromNeoStox();
}

@AfterMethod
public void closeNeoStox() throws InterruptedException
{
	driver.close();
	Reporter.log("Closing application", true);
	Thread.sleep(1000);
}

@DataProvider(name ="logInDetailsForValidateUserName")
public String[][]getLogInDetails1()
{
	String userData[][]= {{"7058086561","9463","Hi Prafulla Patil"},{"9403100530","4580","Hi Piush Patil"}};
	return userData ;
	
}
@DataProvider(name ="logInDetailsForValidateACbalance")
public String[][]getLogInDetails2()
{
	String userData[][]= {{"7058086561","9463"},{"9403100530","4580"}};
	return userData ;

}
}

