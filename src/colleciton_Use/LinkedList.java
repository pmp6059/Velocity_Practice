package colleciton_Use;

//import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedList {
public static void main(String[] args) {
  
    java.util.LinkedList<Object>ll =new java.util.LinkedList<>();
	 
	ll.add("Dhule");
	ll.add(123);
	ll.add('a');
	ll.add(10.55);
	ll.add(true);
	ll.add(null);
	ll.add("Dhule");
	ll.add("PRAFUL");
	
	System.out.println(ll);
	System.out.println("=================");
  
	System.out.println(ll.contains("Dhule"));
	System.out.println("=================");
	
	System.out.println(ll.element());
	System.out.println("=================");
	
	System.out.println(ll.get(6));
	System.out.println(ll.getFirst());
    System.out.println(ll.getLast());
    System.out.println("=================");
    
    System.out.println(ll.indexOf("Dhule"));
    System.out.println("=================");
    
    System.out.println(ll.lastIndexOf("Dhule"));
    System.out.println("=================");
    
    System.out.println(ll.offer("Fagne"));
    System.out.println(ll);
    System.out.println("=================");
    
    System.out.println(ll.peek());
    System.out.println(ll);
    System.out.println("=================");
    
    System.out.println(ll.peekFirst());
    System.out.println(ll.peekLast());
    System.out.println("=================");
    
    System.out.println(ll.poll());
    System.out.println(ll);
    System.out.println(ll.pollFirst());
    System.out.println(ll);
    System.out.println(ll.pollLast());
    System.out.println(ll);
    System.out.println("=================");
    
    System.out.println(ll.pop());
    System.out.println(ll);    
    System.out.println("=================");
    
    System.out.println(ll.remove(3));
    System.out.println(ll);
    System.out.println("=================");
    
    System.out.println(ll.remove(2));
    System.out.println(ll);
    System.out.println("=================");
    
   // System.out.println(ll.removeAll(ll));
   // System.out.println(ll);
    System.out.println("=================");
    
    System.out.println(ll.set(2, "PMP"));
    System.out.println(ll);
    
    System.out.println("=======for loop==========");
    
    //using for loop
    
    for(int i = 0;i<=ll.size()-1;i++)
    {
    	System.out.println(ll.get(i));
    }
    System.out.println("======for each===========");
    
    //for each loop
    
    for(Object a:ll)
    {
    	System.out.println(a);
    }
    System.out.println("======iterator===========");
    
    //iterator
   Iterator<Object>it=ll.iterator();
   while(it.hasNext())
   {
	   System.out.println(it.next());
   }
   System.out.println("=====List Iterator============");
   
   //List Iterator
   ListIterator<Object>lite=ll.listIterator();
   while(lite.hasNext())
   {
	   System.out.println(lite.next());
   }
   System.out.println("=================");
}
}
