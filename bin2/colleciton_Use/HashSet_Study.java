package colleciton_Use;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Study {
public static void main(String[] args) {
	 HashSet<Object> hs=new HashSet<>();
	 
	 hs.add("Praful");
	 hs.add(123);
	 hs.add('J');
	 hs.add(12.55f);
	 hs.add(true);
	 hs.add(null);
	 hs.add("Praful");
	 
	 System.out.println(hs);
	 System.out.println("====================");
	  
	 //we cant use for loop because we dont have get method in HashSet
	 
	 System.out.println("====================");
	 //Iterator
	 Iterator<Object> it = hs.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 System.out.println("====================");
	 //for each
	 for(Object a:hs) 
	 {
		 System.out.println(a);
	 }
	 System.out.println("===================="); 
	 
	 //Enumeration= not supported
	 System.out.println("====================");
	 
	 Object hs2 = hs.clone();
	 System.out.println(hs.clone());
	 System.out.println("====================");
	 
	 System.out.println(hs.contains("Praful"));
	 System.out.println("====================");
	 
	 System.out.println(hs.remove('J'));
	 System.out.println(hs);
	 System.out.println("====================");
	 
	 System.out.println(hs.size());
	 System.out.println("====================");
	 
     System.out.println(hs.toArray());
     System.out.println("====================");





}
}
