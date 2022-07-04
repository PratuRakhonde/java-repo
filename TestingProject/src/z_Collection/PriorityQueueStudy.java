package z_Collection;

import java.util.PriorityQueue;

public class PriorityQueueStudy 
{

	public static void main(String[] args)
	{
       PriorityQueue p=new PriorityQueue<>();
       
       p.add("Pratiksha");
       p.add("Arvind");
       p.add("Rakhonde");
       p.add("From");
       p.add("Buldana");
       
       System.out.println(p);
       System.out.println("------------------------");
       System.out.println(p.size());
       System.out.println("------------------------");
       System.out.println(p.isEmpty());
       System.out.println("------------------------");
       
       System.out.println(p.element());
       System.out.println("-------------------------");
       System.out.println(p);
       System.out.println("-------------------------");
 
       System.out.println(p.peek());
       System.out.println("-------------------------");

       System.out.println(p);
       System.out.println("-------------------------");
       
       System.out.println(p.poll());
       System.out.println("-------------------------");
       
       System.out.println(p);
       
       

       
	}

}
