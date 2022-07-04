package z_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy 
{

	public static void main(String[] args) 
	{
   HashSet h=new HashSet<>();
   
   h.add("Anu");
   h.add('A');
   h.add("Anu");
   h.add(null);
   h.add(null);
   h.add(122.12);
   h.add(123);
   h.add(121);
   h.add("Pune");
   
   System.out.println(h);
   System.out.println("-----------------------------------------------");
   
    Iterator pr = h.iterator();
    
    while(pr.hasNext())
    {
    	System.out.println(pr.next());
    }
	System.out.println("=============================================");

    for(Object p:h)   
    {
    	System.out.println(p);
    }
   
   
	}

}
