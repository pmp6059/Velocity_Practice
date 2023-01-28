package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertMethods {
	
  @Test(priority=1)
  public void assertEquals() 
  {
	  String a = "abc";
	  String b = "abc";
	  
	  Assert.assertEquals(a,b,"a & b is not matching, TC failed");
  }
  @Test(priority=2)
  public void assertNotEquals()
  {
	  String a="Praful";
	  String b="Piyush";
	  
	  Assert.assertNotEquals(a, b,"a & b is matched, TC is failed");
  }
  
  @Test(priority=3)
  public void assertTrue()
  {
	  boolean a = true;
	  
	  Assert.assertTrue(a, "a value is false,TC Failed");
  }
  
  @Test (priority=4)
  public void assertFalse()
  {
	  boolean a=false;
	  Assert.assertFalse(a, "a value is true, TC is failed");
  }
  
  @Test(priority=5)
public void assertNull()
{
	  String a =null;
	  Assert.assertNull(a,"a value is not null, TC is failed");
}
  
  @Test(priority=6)
  public void assertNotNull()
  {
	  String a="Praful";
	   Assert.assertNotNull(a,"a value is null,TC is failed");
  }
  
  @Test(priority=7)
  public void assertFail()
  {
	  Assert.fail();
	  Reporter.log("TC is running", true);
  }
}
