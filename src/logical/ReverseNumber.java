package logical;

public class ReverseNumber {
	public static void main(String[] args) 
	{
		//int a=1234;
		//number-->String
		//String--> number
		
		int orgNum = 1234;
		String orgStr = Integer.toString(orgNum);
		String revStr = "";
		
		for(int i=orgStr.length()-1;i>=0;i--)
		{
			char temp=orgStr.charAt(i);
		    revStr= revStr+ temp;
		}
		
		   int revNum = Integer.parseInt(revStr);
	       System.out.println("Original number is "+orgNum);
		  System.out.println("Reverse number is "+revNum);	
	}

}
