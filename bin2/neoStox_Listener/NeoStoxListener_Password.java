package neoStox_Listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxListener_Password {
@FindBy(id = "txt_accesspin") private WebElement passwordField;

@FindBy(id = "lnk_submitaccesspin") private WebElement submitButton;
 
 public NeoStoxListener_Password(WebDriver driver)
 {
 	PageFactory.initElements(driver, this);
 }
 
 public void enterPassword(String password) throws InterruptedException
 {
 	Thread.sleep(100);
 	passwordField.sendKeys(password);
 	Reporter.log("Enterning password", true);
 }

 
 public void clickOnSubmitButton() throws InterruptedException
 {

 	Thread.sleep(500);
 	submitButton.click();
 	Reporter.log("Clicking on submit button", true);
 }

}
