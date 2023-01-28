package testNG_xmlStudy;

import org.testng.Reporter;

//here we study about xml file exclude and include concept
import org.testng.annotations.Test;

public class NeoStox2 {
  @Test
  public void f()
  {
	  Reporter.log("TC is f is running", true);
  }
  
  @Test
  public void g() 
  {
	  Reporter.log("TC g is running", true);
  }
  
  @Test
  public void h() 
  {
	  Reporter.log("TC h is running", true);
  }
  
  @Test
  public void i() 
  {
	  Reporter.log("TC i is running", true);
  }
}
