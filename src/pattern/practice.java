package pattern;

public class practice {
	public static void main(String[] args)
	{
		int space =4;
		int star=1;
		
		for(int row=1; row<=4;row++)
		{
			for(int i = 1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int column=1;column<=star;column++)
			{
				System.out.print("^");
			}
			System.out.println();
			space--;
			star=star+2;
			
			
			
		}
		
//		int space2 =3;
//		int star2=3;
//		
//		for(int row=1; row<=1;row++)
//		{
//			for(int i = 1;i<=space2;i++)
//			{
//				System.out.print(" ");
//			}
//			for(int column=1;column<=star2;column++)
//			{
//				System.out.print("^");
//			}
//			System.out.println();
//			space =space-1;
//			star=star+2;
//		}
//		int space3 =2;
//		int star3=5;
//		
//		for(int row=1; row<=1;row++)
//		{
//			for(int i = 1;i<=space3;i++)
//			{
//				System.out.print(" ");
//			}
//			for(int column=1;column<=star3;column++)
//			{
//				System.out.print("^");
//			}
//			System.out.println();
//			space++;
//			star--;
//	}
		int space4 =2;
		int star4=5;
		
		for(int row=1; row<=6;row++)
		{
			for(int i = 1;i<=space4;i++)
			{
				System.out.print(" ");
			}
			for(int column=1;column<=star4;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			//space++;
			//star--;
	}
		int space5 =1;
		int star5=7;
		
		for(int row=1; row<=6;row++)
		{
			for(int i = 1;i<=space5;i++)
			{
				System.out.print(" ");
			}
			for(int column=1;column<=star5;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			
	}
		int space6=1;
		int star6=7;
		
		for(int row=1; row<=1;row++)
		{
			for(int i = 1;i<=space6;i++)
			{
				System.out.print(" ");
			}
			for(int column=1;column<=star6;column++)
			{
				System.out.print("^");
			}
			System.out.println();
		}
	}
}
