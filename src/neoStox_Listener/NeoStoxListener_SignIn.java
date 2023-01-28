package neoStox_Listener;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxListener_SignIn
{
   @FindBy(xpath = "(//input[@type='number'])[1]")protected WebElement mobNumField;
   
   @FindBy(id ="lnk_signup1")protected WebElement SignInButton2;
   
   
   public NeoStoxListener_SignIn(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void enterMobNum(String mobNum) throws InterruptedException, IOException
   {
	   Thread.sleep(1000);
	   mobNumField.sendKeys(Utility_Listener.readDataFromPropertyfile("mobNum"));
   }
   
   public void clickOnSignInButton2() throws InterruptedException
   {
	   
	   SignInButton2.click();
	   Reporter.log("Clicking on signInButton2");
   }
   
}
