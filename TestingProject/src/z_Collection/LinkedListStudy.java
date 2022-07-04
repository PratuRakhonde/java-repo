package z_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStudy
{

	public static void main(String[] args) 
	{
     LinkedList ll=new LinkedList<>();
     
     ll.add("Anu");
     ll.add('A');
     ll.add("Anu");
     ll.add(null);
     ll.add(null);
     ll.add(122.12);
     ll.add(123);
	 ll.add(121);
	 ll.add("Pune");
	
	System.out.println(ll);
	System.out.println("=============================================");
	
	
	System.out.println(ll.get(0));
	System.out.println("=============================================");

	
	ll.add(3, "Yashu");
    System.out.println(ll);	
	System.out.println("=============================================");

	System.out.println(ll.size());
	System.out.println("=============================================");

	System.out.println(ll.contains(122.12));
	System.out.println("=============================================");
	
	System.out.println(ll.remove(4));
	System.out.println("=============================================");
	
       Iterator itr = ll.iterator();
       
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
       System.out.println("------------------------------------------------");
       for(int i=0;i<=ll.size()-1;i++)
       {
    	   System.out.println(ll.get(i));
       }
	System.out.println("---------------------------------------------------");
	
	for(Object p:ll)
	{
		System.out.println(p);
	}
	
	}

}
