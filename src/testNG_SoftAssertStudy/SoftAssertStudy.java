package testNG_SoftAssertStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  @Test
  public void myTest1()
  {
	  String a="abc";
	  String b="abc";
	  
	  SoftAssert soft=new SoftAssert();
	  
	  soft.assertNull(a, "a is not null TC failed");
	  soft.assertNotEquals(a,b,"a & b are equals, TC failed");
	  
     soft.assertAll();
  }
  
}
