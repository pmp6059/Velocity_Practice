package logical;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// This is for Prime number
		
		int num=10;
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}

		if(count==1)
		{
			System.out.println("its not prime number");
		}
		else
		{
			System.out.println("its a prime number");
		}
		
	}

}
