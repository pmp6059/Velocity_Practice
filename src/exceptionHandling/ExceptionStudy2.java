package exceptionHandling;

public class ExceptionStudy2 {
  public static void main(String[] args)
{
   String a ="abc";
   
   try {
	//risky code
   System.out.println(a.charAt(10));

   System.out.println("Hii Hello....");
  }
    catch(StringIndexOutOfBoundsException e)
  {
    System.out.println("Select range in between 0-2");
  }
   System.out.println("Class ExceptionStudy 2 is running");
  }
}
