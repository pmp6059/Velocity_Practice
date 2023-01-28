package logical;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) 
	{
		
		//it gives the user input value
		
	    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any number");
//	    String name = sc.next();
//	    System.out.println("My name is "+name);
	    

	 int a= sc.nextInt();
	 int b=sc.nextInt();
	 
	 int c=a+b;
	 System.out.println("Addition is "+c);
	    
	}
	
	

}
