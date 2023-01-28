package logical;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter any string");
		String orgString = sc.next();
		String revString = "";

		for(int i = orgString.length()-1;i>=0;i--)
		{
			 char temp = orgString.charAt(i);	
			revString= revString+temp;
	    }
		System.out.println("Original String is "+orgString);
		System.out.println("Reverse String is "+revString);
	}

}
