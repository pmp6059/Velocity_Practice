package testNG_xmlStudy;

import org.testng.Reporter;

//here we study about xml file exclude and include concept
import org.testng.annotations.Test;

public class NeoStox1 {
  @Test
  public void a() 
  {
	  Reporter.log("TC a is running", true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("TC b is running", true);
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("TC c is running", true);
  }
  
  @Test
  public void d() 
  {
	  Reporter.log("TC d is running", true);
  }
  
  @Test
  public void e() 
  {
	  Reporter.log("TC e is running", true);
  }
}
