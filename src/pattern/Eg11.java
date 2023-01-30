package pattern;

public class Eg11 {

	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		// *
		// **
		// ***
		// ****
		// *****
		
		int star=5;
		 
		for(int row=1;row<=10;row++)
		{
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		if(row<5)
		{
			star--;
		}
		else
		{
			star++;
		}
		}

	}

}
