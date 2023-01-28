package data_Provider;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class Password_DataProvider
{@FindBy(xpath =" //input[@type='password']") private WebElement passwordField;

@FindBy(id = "lnk_submitaccesspin") private WebElement submitButton;
 
 public Password_DataProvider(WebDriver driver)
 {
 	PageFactory.initElements(driver, this);
 }
 
 public void enterPassword(String password) throws InterruptedException, IOException
 {
 	Thread.sleep(1000);
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
