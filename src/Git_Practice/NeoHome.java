package Git_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoHome {
 
	@FindBy(xpath="(//a[text()='Sign In'])[2]")private WebElement signInButton;
	 
	
	 public NeoHome(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	public void clickOnSignInButton() throws InterruptedException
	{
		Thread.sleep(500);
		signInButton.click();
		Reporter.log("Clicking on signIn button", true);
	}
}
