package pattern;

public class Eg7 {

	public static void main(String[] args) {
		
//		*
//		***
//		*****
//		*******
//		*********

		int star=1;
		
		for(int row=1;row<=6;row++)
		{
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			star++;
		}
		
		System.out.println();
		
	      //*********
	      //*******
	      //*****
	      //***	
          //**    
	      //*			
		int star1=6;
        
        for(int row=1;row<=6;row++)
        {
        	for(int column = 1;column<=star1;column++)
        	{      		
        		System.out.print("*");
        	}
        	System.out.println();
    		
    		star1--;
        }
	}
}
