//FOR SPECIFIC ARRAYLIST
package z_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInt
{

	public static void main(String[] args) 
	{
       ArrayList<Integer> al=new ArrayList<Integer>();	
       
       al.add(23);
       al.add(23);
       al.add(23);
       al.add(23);
       al.add(23);
       al.add(23);
	
       Iterator<Integer> p = al.iterator();
       
       while (p.hasNext())
       {
		System.out.println(p.next());
		
	   }
       System.out.println("==============================");

       //{
       //System.out.println(p.next());   
       //}
       System.out.println("==============================");
       
       
       for(Integer a:al)
       {
    	   System.out.println(a);
       }
	
	}

}
