package exceptionHandling;

public class ExceptionStudy1 {
  public static void main(String[] args) 
{
	  
   System.out.println("Main method started");
	int a=10; 
	int b=0; 
	int c=0;
	try   //Risky code write in try block
	{ 
		// if exception can occur then try block get executed.
		c=a/b;// risky code
		
	  
	}
	catch(ArithmeticException e)
	{
		//If exception occure then it catch block get executed
	  System.out.println("cant divided by 0");	
	}
	 System.out.println(c);
	System.out.println("mian method ended");
}
}
