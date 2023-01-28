package neoStox_Listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxListener_SignIn
{
   @FindBy(id = "MainContent_signinsignup_txt_mobilenumber")protected WebElement mobNumField;
   
   @FindBy(id ="lnk_signup1")protected WebElement SignInButton2;
   
   
   public NeoStoxListener_SignIn(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void enterMobNum(String mobNum)
   {
	   mobNumField.sendKeys("mobNum");
   }
   
   public void clickOnSignInButton2()
   {
	   SignInButton2.click();
	   Reporter.log("Clicking on signInButton2");
   }
   
}
