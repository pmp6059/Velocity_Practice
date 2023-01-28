package neoStoxPOMClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage 
{
  @FindBy(xpath = "(//input[@type='number'])[1]")private WebElement mobNumField;
  
  @FindBy(id="lnk_signup1")private WebElement SignInButton;
  


public NeoStoxSignInPage(WebDriver driver)
{
   PageFactory.initElements(driver, this);
}

public void enterMobNum(String mobNum)
{
	mobNumField.sendKeys(mobNum);
	
}

public void clickOnSignInButton()
{
	SignInButton.click();
}
}
