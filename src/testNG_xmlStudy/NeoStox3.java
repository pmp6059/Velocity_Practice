package testNG_xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;


//here we study about xml file exclude and include concept
public class NeoStox3 {
  @Test(groups="regression")
  public void a() 
  {
	  Reporter.log("TC a is running", true);
  }
  
  @Test(groups="sanity")
  public void b()
  {
	  Reporter.log("TC b is running" );
  }
  
  @Test()
  public void c()
  {
	  Reporter.log("TC c is running", true);
  }
  
  @Test(groups= {"regression","sanity"})
  public void d()
  {
	  Reporter.log("TC d is running", true);
  }
}
