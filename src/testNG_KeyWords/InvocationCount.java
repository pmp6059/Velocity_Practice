package testNG_KeyWords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount 
{
  @Test(invocationCount=4)
  public void myTest() 
  {
	  Reporter.log("My Test is running", true);
  }
  
 @BeforeMethod
 public void beforeMethod()
 {
	 Reporter.log("Before method is running", true);
 }
  
 @AfterMethod
 public void afterMethod()
 {
	 Reporter.log("After method is running", true);
	 System.out.println("=============================");
 }
 
}
