package pattern;

public class Eg13{

	public static void main(String[] args)
	{
		//*         *
		//**       **
		//***     ***
		//****   ****
		//***** *****
		//****   ****
		//***     ***
		//**       **
		//*         *
     int space=5;
     int star=1;
     int space2=4;
     int star2=1;
     
     for(int row=1;row<=9;row++)
     {
    	 for(int column=1;column<=star;column++)
    	 {
    		 System.out.print("*");
    	 }
    	 for(int i=1;i<=space;i++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int j = 1;j<=space2;j++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int column = 1;column<=star2;column++)
    	 {
    		 System.out.print("*");
    	 }
    	 
    	 System.out.println();
    	 if(row<5)
    	 {
    		 star++;
    		 space--;
    		 star2++;
    		 space2--;
    	 }
    	 else
    	 {
    		 star--;
    		 space++;
    		 star2--;
    		 space2++;
    	 }
     }	
  }
}
