package colleciton_Use;

import java.time.temporal.TemporalQueries;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Study {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
        al.add("Praful");
        al.add(123);
        al.add(10.25);
        al.add('A');
        al.add(null);
        al.add(true);
        al.add("Praful");
        
        System.out.println(al);
        
       System.out.println("==========================");
       
       ArrayList<String> al1=new ArrayList<>();
       
       System.out.println(al1.add("Prafulla Patil"));
       
       al1.add("Hii");
       
       al1.add("GM");
       
       al1.add(0, "pmp");
       
       al1.add(null);
       
       al1.add("Good Afternoon");
     
       System.out.println(al1.size());//Size method shows the size of Array List
       System.out.println(al1.get(0));//get method shows the elements number
       System.out.println(al1);
       
       System.out.println("==========================");
       
       //al1.clear();
       System.out.println(al1);
       
       System.out.println("==========================");
       
       Object al2 = al1.clone();
       System.out.println(al1);
       System.out.println(al2);
       
       System.out.println("======================");
       
       System.out.println(al1.contains("GM"));
       System.out.println(al1.contains("GN"));
       
       System.out.println("=================");
       
       String ele = al1.get(2);
       System.out.println(ele);
       
       System.out.println("===================");
       
       System.out.println(al1.indexOf("Hii"));
       System.out.println("====================");
       
       System.out.println(al1.isEmpty());
       System.out.println("=====================");
       
       System.out.println(al1.remove(0));
       System.out.println(al1);
       System.out.println(al1.remove("Good Afternoon"));
       System.out.println(al1);
       System.out.println("=========================");
       
       al1.set(0, "Fagne");
       System.out.println(al1);
       System.out.println("=======================");
	   
       System.out.println(al1.size());
       System.out.println("=======================");
	}

}
