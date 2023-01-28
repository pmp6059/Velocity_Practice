package pattern;

public class Eg6 {
public static void main(String[] args) 
{
 
	//    *
	//   **
	//  ***
	// ****
	//*****
	
	int space=4;
	int star=1;
	
	for(int row=1;row<=5;row++)
	{
		for(int i=1;i<=space;i++)
		{
			System.out.print(" ");
		}
		
		for(int column=1;column<=star;column++)
		{
			System.out.print("*");
		}
		System.out.println();
		space--;
		star++;
	}
		
}
}
