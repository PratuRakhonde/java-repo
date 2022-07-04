package z_Collection;

import java.util.ArrayList;

public class ArrayListStudy
{

	public static void main(String[] args) 
	{
     ArrayList al=new ArrayList();
     
     al.add("Pratu");
     al.add(12345);
     al.add('P');
     al.add(null);
     al.add("Pratu");
     al.add(123.32);
     
     System.out.println(al);              //HERE WE GWT ALL OUTPUTS
     
     // IF WE WANT PERTICULAR OBJECT THEN 
     
     System.out.println(al.get(4));               // HERE WE TYPE INDEX NUMBER WITH THE HELP OF GET METHOD

	}

}
