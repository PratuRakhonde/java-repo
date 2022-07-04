package z_Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashLinkedSet
{

	public static void main(String[] args) 
	{
     LinkedHashSet lh=new LinkedHashSet<>();
     
     lh.add("Anu");
     lh.add('A');
     lh.add("Anu");
     lh.add(null);
     lh.add(null);
     lh.add(122.12);
     lh.add(123);
     lh.add(121);
     lh.add("Pune");
     
     System.out.println(lh);
     System.out.println("--------------------------------------------");
     
     for(Object z:lh)
     {
    	 System.out.println(z);
     }
     System.out.println("--------------------------------------------");

     Iterator itr = lh.iterator();
     
     while(itr.hasNext())

     {
    	 System.out.println(itr.next());
     }
     System.out.println("--------------------------------------------");
     
     
     
     
     		
	}

}
