package z_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy2 
{

	public static void main(String[] args) 
	{
	
	ArrayList ar=new ArrayList();
	
	ar.add("Pratu");
	ar.add(1234);
	ar.add('P');
	ar.add(null);
	ar.add(null);
    ar.add("Pratu");
    
    System.out.println(ar);                       // IT SHOWS ALL RESULT
    System.out.println("*************************");

    System.out.println(ar.get(0));               // SHOW SINGLE RESULT BY USING INDEX
    System.out.println(ar.get(1));
    System.out.println(ar.get(2));
    System.out.println(ar.get(3));
    System.out.println(ar.get(4));
    System.out.println("*************************");

    //IF WE WANT TO ADD NUMBER BEFORE 'P' THEN

    ar.add(2, "Pratiksha");
    System.out.println(ar);
    
    ar.remove(4);
    System.out.println(ar);
    System.out.println("*************************");

   System.out.println(ar.size());                                   //IT DEFINES THE SIZE OF THE ARRAY/INDEX
   System.out.println("*************************");
   
   System.out.println(ar.contains("Pratu"));
   System.out.println(ar.contains('p'));
   System.out.println("*************************");
   
  System.out.println(ar);
  System.out.println("*************************");
    
  //MOVING THROUGH LIST BY USING FOR LOOP
  
  for(int i=0;i<=ar.size()-1;i++)
  {
	  System.out.println(ar.get(i));
  }
  System.out.println("*************************");

  	//MOVING THROUGH LIST BY USING CURSOR---ITERATOR
  
  Iterator itr = ar.iterator();
  
  while(itr.hasNext())
  {
	  System.out.println(itr.next());
  }
  System.out.println("*************************");
	  
	  //MOVING THROUGH LIST BY USING CURSOR --LISTITRATOR
     
     ListIterator Litr = ar.listIterator();
     
     while(Litr.hasNext())
     {
    	 System.out.println(Litr.next());
     }
     System.out.println("===============================");
     
	  //FOR EACH LOOP
     
     for(Object p:ar)
     {
    	 System.out.println(p);
     }
	  
	}

}
