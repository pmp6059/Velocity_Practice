package testNG_xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;


//here we study about xml file exclude and include concept
public class NeoStox4 {
  @Test(groups="regression")
  public void e() 
  {
	  Reporter.log("TC e is running", true);  
   }
  
  @Test
  public void f() 
  {
	  Reporter.log("TC f is running", true);  
   }

  @Test(groups={"regression","sanity"})
  public void g() 
  {
	  Reporter.log("TC g is running", true);  
   }
  
  @Test(groups="regression")
  public void h() 
  {
	  Reporter.log("TC h is running", true);  
   }
}

