package logical;

public class CountNumberOfBlanckSpaces {

	public static void main(String[] args) {
		// P  U N   E

		String s = "P  U N  E";
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char temp = s.charAt(i);
			if(temp==' ')
			{
				count++;
			}
		}
		System.out.println("String is "+s);
		System.out.println("Number of blanck spaces "+count);
		
		
		
	}

}
