package logical;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		// Even Number/2 --> remainder 0
	//	System.out.println(10/2);
    //	System.out.println(10%2);   %(Mode of) show the remainder
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		int num =sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Given number is even number");
		}
		else
		{
			System.out.println("Givern number is odd number");
		}
		

	}

}
