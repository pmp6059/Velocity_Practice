package pattern;

public class Eg4 {
	public static void main(String[] args) 
	{
	  //*****
	  //****
	  //***
	  //**
	  //*
		
	  int star=5;
	  //outer for loop =row
	  for(int row=1;row<=5;row++)
	  {
		  //inner for loop = column
		  for(int column =1; column<=star;column++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
		  star--;
	  }
	}

}
