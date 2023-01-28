package neoStoxPOMClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxDashBoardPage
{
@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement popUpOkButton;
	
	//@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement popUpCloseButton;
	
	@FindBy(id="lbl_username")private WebElement userName;
		
	@FindBy(id="lnk_logout")private WebElement logOutButton;
	
  
    
	public NeoStoxDashBoardPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void handlePopUp() throws InterruptedException
	{ 
		Thread.sleep(500);
		popUpOkButton.click();
//		Thread.sleep(1000);
//		popUpCloseButton.click();
	}
	
	public void validateUserName(String expUserName)
	{
		String actualName = userName.getText();
		
		if(expUserName.equals(actualName))
		{
			System.out.println("TC is passed, exp and actual user name matched");
		}
		
		else
		{
			System.out.println("TC is failed, exp and actual user name is not matched");
			
		}
		
	}
	
	
	public void logOutFromNeoStox() throws InterruptedException
	{
		Thread.sleep(500);
		userName.click();
		
		Thread.sleep(500);
		logOutButton.click();
	}
	
	public String getActualUserName()
	{
		String actualUserName = userName.getText();
		return actualUserName;
				
	}
	
	
}
