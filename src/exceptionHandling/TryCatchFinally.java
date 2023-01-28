package exceptionHandling;

public class TryCatchFinally {
 public static void main(String[] args) 
 {
    String a="abc";
    
    try
    {
    	System.out.println(a.charAt(10));
    }
    
    catch(NullPointerException e)
    {
    	System.out.println("a should not be null");
    }
    catch(StringIndexOutOfBoundsException e)
    {
    	System.out.println("Index value should be within 0-2");
    }
    catch(Exception e)
    {
    	
    }
    finally
    {
    	System.out.println("Try Catch Finally method is over");
    }
 }
}
