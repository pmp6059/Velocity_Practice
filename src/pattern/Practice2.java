package pattern;

public class Practice2 {

	public static void main(String[] args) {
		// ********
		// *      *
		// *      *
		// ********
		// *
		// *
		// *
		
       int star=7;
       
       for(int row=1;row<=7;row++)
       {
    	   for(int column=1;column<=star;column++)
    	   {
    		   System.out.print("*");
    	   }
    	   
    	   System.out.println();
    	   if(row<4)
    	   {
    		   star=7;
    	   }
    	   else
    	   {
    		   star=1;
    	   }
       }
		
	}

}
