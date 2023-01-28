package colleciton_Use;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Study {
 public static void main(String[] args) {
	  Vector<Object>v=new Vector<>();
	  
	    v.add(1234);
		v.add("Praful");
		v.add('a');
		v.add(10.55);
		v.add(true);
		v.add(null);
		v.add(null);
		v.add("Praful");
		
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		System.out.println("======================");

        System.out.println(v.contains("Praful"));
        
        System.out.println("======================");
        System.out.println(v.elementAt(7));
        
        System.out.println("======================");
        System.out.println(v.containsAll(v));
		
        System.out.println("======================");
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println("======================");
        System.out.println(v.get(5));
        System.out.println("======================");
        
        System.out.println(v.indexOf("Praful"));
        System.out.println("======================");
        
        System.out.println(v.indexOf("Praful", 0));
        System.out.println("======================");
        
        System.out.println(v.lastIndexOf("Praful"));
        System.out.println("======================");
        
        System.out.println(v.remove(0));
        System.out.println(v);
        System.out.println("======================");
        
        System.out.println(v.remove(0));
        System.out.println(v);
        System.out.println("======================");
        
        //System.out.println(v.removeAll(v));
       // System.out.println(v);
        System.out.println("======================");
        
        v.setSize(10);
        v.set(9, "Fagne");
        System.out.println(v);
        System.out.println("======================");
        
        v.setElementAt("P>M>P", 0);
		System.out.println(v);
		System.out.println("======================");
		
		System.out.println(v.size());
		System.out.println("======================");
		
		System.out.println(v.toArray());
		System.out.println("======================");
		System.out.println(v.toString());
		System.out.println("======================");
		
		System.out.println(v.lastIndexOf(10.55));
		
		System.out.println(v.lastElement());
		System.out.println(v.lastIndexOf(null));
		System.out.println(v.remove(0));
		System.out.println("======================");
		
		System.out.println("======================");
		//using for loop
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("======================");
		//for each
		
		for(Object a:v)
		{
		System.out.println(a);	
		}
		System.out.println("======================");
		//integrator
		Iterator<Object>it=v.iterator() ;
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("======================");
		
		//list-iterator
		ListIterator<Object> li=v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("=======Enum===============");
		//Enumeration
		
	Enumeration<Object> en = v.elements();
     
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement());
	}
 
 
 }
}
