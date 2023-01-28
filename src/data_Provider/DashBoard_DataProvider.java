package data_Provider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class DashBoard_DataProvider 
{
	 WebDriver driver;

	  @FindBy(xpath="(//a[text()='OK'])[2]")private WebElement popUpOkButton;

	  @FindBy(id="lbl_username")private WebElement userName;

	  @FindBy(id="lnk_logout")private WebElement logOutButton;

	  @FindBy(id = "lbl_curbalancetop")private WebElement acBalance;


	  public DashBoard_DataProvider(WebDriver driver) 
	  {
	  	PageFactory.initElements(driver, this);
	  }

	  public void handlePopUp(WebDriver driver) throws InterruptedException
	  { 
	  	//Utility_PropertyFile.impWait(1000, driver);
	      Thread.sleep(500);
	  	if(popUpOkButton.isDisplayed())
	  	{
	  		
	       Utility_Data_Provider.scrollIntoView(driver,popUpOkButton );
	  	popUpOkButton.click();
	  	Reporter.log("Clicking on pop button", true);
	  	

	  	}
	  	else
	  	{
	  		Reporter.log("There is no popUP", true);
	  	}
	  }

	 

	  public void logOutFromNeoStox() throws InterruptedException
	  {
	  	Thread.sleep(1000);
	  	userName.click();
	  	
	  	Thread.sleep(1000);
	  	logOutButton.click();
	  	Reporter.log("Logging out from neoStoc", true);
	  }

	  public String getActualUserName()
	  {
	  	String actualUserName = userName.getText();
	  	Reporter.log("Actual user name is "+actualUserName, true);
	  	return actualUserName;
	  			
	  }

	  public String getAcBalance()
	  {
	  	String balance = acBalance.getText();
	  	Reporter.log("getting ac balance", true);
	  	Reporter.log("Account balance is "+balance, true);
	  	return balance;
	  }
}
