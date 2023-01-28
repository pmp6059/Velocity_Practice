package logical;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter any string");
		String orgStr = sc.next();
		String revStr = "";
		
		for(int i=orgStr.length()-1;i>=0;i--)
		{
			char temp = orgStr.charAt(i);
			 revStr = revStr+temp;
		}
		System.out.println("Original string is "+orgStr);
		System.out.println("Reverse string is "+revStr);
		
		
		if(orgStr.equals(revStr))
		{
			System.out.println("If the strign is palindrome");
		}
		else
		{
			System.out.println("If the string is not palindrome");
		}
		

	}

}
