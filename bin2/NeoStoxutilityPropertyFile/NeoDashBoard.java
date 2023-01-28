package NeoStoxutilityPropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class NeoDashBoard 
{  WebDriver driver;

@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement popUpOkButton;

//@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement popUpCloseButton;

@FindBy(id="lbl_username")private WebElement userName;

@FindBy(id="lnk_logout")private WebElement logOutButton;

@FindBy(id = "lbl_curbalancetop")private WebElement acBalance;


public NeoDashBoard(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public void handlePopUp(WebDriver driver) throws InterruptedException
{ 
	//Utility_PropertyFile.impWait(1000, driver);
    Thread.sleep(500);
	if(popUpOkButton.isDisplayed())
	{
		
     Utility_PropertyFile.scrollIntoView(driver,popUpOkButton );
	popUpOkButton.click();
	Reporter.log("Clicking on pop button", true);
	
//	Thread.sleep(1000);
//	popUpCloseButton.click();
	}
	else
	{
		Reporter.log("There is no popUP", true);
	}
}

////public void validateUserName(String expUserName)
////{
////	String actualName = userName.getText();
////	
////	if(expUserName.equals(actualName))
////	{
////		System.out.println("TC is passed, exp and actual user name matched");
////	}
////	
////	else
////	{
////		System.out.println("TC is failed, exp and actual user name is not matched");
////		
////	}
//	
//}

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
