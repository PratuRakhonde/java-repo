package z_Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy 
{

	public static void main(String[] args)
	{
     Vector v=new Vector<>();
     
     v.add("yash");
     v.add("pratu");
     v.add('A');
     v.add(null);
     v.add("yash");
     v.add(123.32);
     v.add(321);
     
     System.out.println(v);
     System.out.println("------------------------------------------");              //FOR ALL RESULT
     
     v.add(2,"Tanu");                                                               // HERE WE ADD 'TANU' IN EXISTING LIST    
     System.out.println(v);
     System.out.println("-------------------------------------------");
     
     v.remove(3);
     System.out.println(v);                                                         //HEE WE REMOVE OBJECTWHICH IS PRESENT AT INDEX POSITION 3
     System.out.println("-------------------------------------------");
	
	System.out.println(v.contains("Tanu"));                                         // HERE WE CHECK IS 'TANU'PRESENT IN EXISTING LIST OR NOT 
    System.out.println("-------------------------------------------");
    
    System.out.println(v.size());	                                                //HERE WE CHECK SIZE OF THE LIST
    System.out.println("-------------------------------------------");
    
    //BY USING FOR LOOP
 
    for(int i=0;i<=v.size()-1;i++)
    {
    	System.out.println(v.get(i));
    }
    System.out.println("-------------------------------------------");

    //USING WHILE LOOP
    
    Iterator vc = v.iterator();
    
    while(vc.hasNext())
    {
    	System.out.println(vc.next());
    }
    System.out.println("-------------------------------------------");

    //USING FOR ECH LOOP
    
    for(Object a:v)
    {
    	System.out.println(a);
    }
    System.out.println("-------------------------------------------");
    
     Enumeration en = v.elements();
     
     while(en.hasMoreElements())
     {
    	 System.out.println(en.nextElement());
     }
    
    
    
    
    
    
	}

}
