package pattern;

public class Eg5 {
public static void main(String[] args) 
{
	//*****
	// ****
	//  ***
	//   **
	//    *
	
	
	int space=0;
	int star=5;
	
	for(int row=1;row<=5;row++)
	{
		for(int i=1;i<=space;i++)
		{
			System.out.print(" ");
		}
		for(int column=1;column<=star;column++)
		{
			System.out.print("*");
			//System.out.print(column);
		}
		System.out.println();
		space++;
		star--;
	}
}
}
