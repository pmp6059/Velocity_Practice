package NeoStoxutilityPropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoHome {
	

		//1. Data membered should be declared globally with access level private using @findBy Annotation.
		@FindBy(xpath ="(//a[text()='Sign In'])[1]")private WebElement signInButton;
	 
		//2. Initialize within a constructor with access level public using pagefactory.
		 public NeoHome(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		 }
		 
		//3.Utilize within a method using access level public.
		public void clickOnSignInButton() throws InterruptedException
		{
			Thread.sleep(1000);
			signInButton.click();
			Reporter.log("Clicking on signIn button", true);
		}


}
