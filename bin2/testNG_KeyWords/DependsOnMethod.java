package testNG_KeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test()
  public void a() 
  {
	  Assert.fail();
	  Reporter.log("TC a is running", true);
  }
  
  @Test(dependsOnMethods ={"a"})
  public void b()
  {
	  Reporter.log("TC b is running which is dependsOnMethods a", true);
  }
  
  @Test
  public void c()
  {
	  Reporter.log("TC c is running ", true);
  }
   
  @Test(dependsOnMethods= {"b","a" })
  public void d()
  {
	  Reporter.log("TC d is running", true);
  }
}
