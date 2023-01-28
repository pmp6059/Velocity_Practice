package testNG_KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
  @Test(timeOut=500)
  public void a() throws InterruptedException 
  {
	Thread.sleep(100);
	  Reporter.log("TC a is running", true);
  }
  @Test(timeOut=500)
  public void b() throws InterruptedException
  {
	  Thread.sleep(100);
	Reporter.log("TC b is running", true);  
  }
  
  
}
