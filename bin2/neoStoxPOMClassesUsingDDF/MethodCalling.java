package neoStoxPOMClassesUsingDDF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MethodCalling {
  @Test
  public void testing() throws EncryptedDocumentException, IOException 
  {
	  WebDriver driver =null;
	  System.out.println(GeneralMethods.readDataFromExcel(0, 0));
	  System.out.println(GeneralMethods.readDataFromExcel(0, 1));
	  
	  GeneralMethods.implicitWait(1000, driver);
	  GeneralMethods.implicitWait(5000, driver);
	  
	  GeneralMethods.takesScreenshot(driver, "My SCreenshot");
    //  GeneralMethods.takesScreenshot(driver, "My SCreenshot 2");
	  
	  GeneralMethods.scrollIntoView(driver, null);
	  
	  
  }
}
