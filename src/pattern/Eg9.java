package pattern;

public class Eg9 {

	public static void main(String[] args) {
		// *******
		//  *****
		//   ***
	    //    *
		
		int space =0;
		int star =7;
		
		for(int row=1;row<=4;row++)
		{
			for(int i=0;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
		System.out.println();
	      space++;
	      star=star-2;
		}
		
		int space2 =3;
		int star2=1;
		
		for(int row =1;row<=4;row++)
		{
			for(int i=0;i<=space2;i++)
			{
				System.out.print(" ");
			}
			for(int column=1;column<=star2;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			space2--;
			star2=star2+2;
		}
	}

}
