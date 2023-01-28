package exceptionHandling;

public class FinallyBlock {
 public static void main(String[] args)
{
  String a="abc";
  
  try 
  {
	  System.out.println(a.charAt(4));
  }
  
  finally
  {
	  System.out.println("Finally block method is running");
  }
}
}
