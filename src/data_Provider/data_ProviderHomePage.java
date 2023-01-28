package data_Provider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class data_ProviderHomePage {
	
	
		@FindBy(xpath="(//a[text()='Sign In'])[1]")private WebElement SignInButton;
		
	 public data_ProviderHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnSignInButton() throws InterruptedException
	{
		Thread.sleep(500);
	  SignInButton.click();
	  Reporter.log("Clicking on signIn button", true);
	}

}

