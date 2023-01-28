package pattern;

public class Eg3 {

	public static void main(String[] args) 
	{
	  //*
	  //**
	  //***
	  //****
	  //*****
	
		//row=5
		//column =5
		
		int star =1;
		
		//outer for loop = row
		for(int row=1;row<=5;row++)
		{
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	
	
	}

}
