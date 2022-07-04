package z_Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy 
{

	public static void main(String[] args) 
	{
     TreeSet t=new TreeSet<>();
     
     t.add(8);
     t.add(3);
     t.add(6);
     t.add(10);
     t.add(1);
     t.add(0);
     
     System.out.println(t);
     
     System.out.println("-------------------------------------------");
     System.out.println(t.pollFirst());
     System.out.println("-------------------------------------------");
     System.out.println(t);
     System.out.println("-------------------------------------------");
     System.out.println(t.pollLast());
     System.out.println("-------------------------------------------");
     System.out.println(t);  
     System.out.println("-------------------------------------------");
     System.out.println(t.contains(8));
     
     System.out.println("-------------------------------------------");
     
     Iterator it = t.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
	
     System.out.println("-------------------------------------------");
      
     for(Object a:t) 
     {
    	System.out.println(a); 
     }
      
	}

}
