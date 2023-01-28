package colleciton_Use;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {
public static void main(String[] args) {
	LinkedHashSet<String> lh = new LinkedHashSet();
	
	lh.add("Praful");
	lh.add("Mumbai");
	lh.add("Dhule");
    lh.add("Fagne");
    lh.add("Jalgoan");
    lh.add("Praful");
    lh.add(null);
    
    System.out.println(lh);
    System.out.println(lh.size());
    
    System.out.println("====iterator====");
    
    Iterator<String> it = lh.iterator();
  
    while(it.hasNext()) {
    	System.out.println(it.next());
    }

    System.out.println("====for each=====");
    for(Object a:lh)
    {
   System.out.println(a);
    }
}
}

