package colleciton_Use;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
 
	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<>();
		
		al.add(1234);
		al.add("Hii");
		al.add('a');
		al.add(123.01);
		al.add(true);
		al.add(null);
		
		System.out.println(al);
		 System.out.println("=======================");
	   
		 //traversing using for loop
		 System.out.println("===using for loop===");
   
		 for(int i = 0;i<=al.size()-1;i++)
		 {
			 System.out.println(al.get(i));
		 }
	    
		 System.out.println("===using iterator===");
		   //traversing using iterator
		 Iterator<Object>it=al.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 System.out.println("===using list iterator===");
		  
		 ListIterator<Object>LI=al.listIterator();
		 while(LI.hasNext())
		 {
			 System.out.println(LI.next());
		 }
		 System.out.println("===using for each===");
		 for(Object a:al)
		 {
			System.out.println(a); 
		 }
	
		 System.out.println("======Assignment integer===");
		   
		 ArrayList<Integer>al2=new ArrayList<>();
		 
		 al2.add(10);
		 al2.add(11);
		 al2.add(12);
		 al2.add(13);
		 al2.add(14);
		 al2.add(15);
		 al2.add(11);
		 
		 System.out.println(al2);
		 
		 
		 System.out.println("======================");
		 
		 System.out.println(al2.contains(11));
		 
		 System.out.println("=========clone=============");
		 
		Object al3 = al2.clone();
		System.out.println(al3);
		 
		 System.out.println("======================");
		 
	    al2.get(0);
	    System.out.println(al2.get(0));
	    System.out.println("======================");
	    
	    al2.indexOf(11);
	   System.out.println(al2.indexOf(11));
	   
	   System.out.println("======================");
	   
	   al2.isEmpty();
	   System.out.println(al2.isEmpty());
	   System.out.println("======================");
	    
	   al2.lastIndexOf(al2);
	   System.out.println(al2.lastIndexOf(15));
	   System.out.println("======================");
	   
	   
	   System.out.println(al2.remove(0));
	   System.out.println(al2);
	   System.out.println("======================");
	 
	   al2.set(0, 12);
	   System.out.println(al2.set(0,12));
	  System.out.println(al2);
	  System.out.println("======================");
	  
	  System.out.println("===Assignment Float===");
	  
	  ArrayList<Float>al4 =new ArrayList<>();
	   
	  al4.add(10.00f);
	  al4.add(11.11f);
	  al4.add(12.12f);
	  al4.add(13.13f);
	  al4.add(14.14f);
	  al4.add(15.15f);
	  
	 System.out.println(al4);
	 
	 System.out.println("==using for loop===");
	  
	for(int i = 0;i<=al4.size()-1;i++) 
	{
		System.out.println(i);
	}
	
	System.out.println("===using iterator===");
	 
	Iterator<Float>it1=al4.iterator();
	while (it1.hasNext())
	{
		System.out.println(it1.next());
	}
	System.out.println("===List iterator===");
	
	ListIterator<Float>LI1=al4.listIterator();
	while(LI1.hasNext()) 
	{
		System.out.println(LI1.next());
	}
	
	System.out.println("===for Each===");
	for (Float a:al4)
	{
		System.out.println(a);
	}

	}
}
