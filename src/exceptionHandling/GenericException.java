package exceptionHandling;

public class GenericException {

	public static void main(String[] args)
	{
	  String a=null;
	  
    try
    {
	  System.out.println(a.charAt(1));
    
    }
    
    catch(StringIndexOutOfBoundsException e)
    {
    	System.out.println("Index range should be 0-1");
    }
    catch(NullPointerException e)
    {
    	System.out.println("a value should be not null");
    	System.out.println(e.fillInStackTrace());
    	e.printStackTrace();
    }
    catch(Exception e)
    {
    	System.out.println("Exception occurred");
    }
	}

}
