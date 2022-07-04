package z1_logical;

import java.util.Scanner;

public class ReverceString 
{

	public static void main(String[] args) 
	{
//create object
      Scanner s=new Scanner(System.in);
      
      System.out.println("ENTER STRING INPUT VALUE");
      String sc = s.next();
      System.out.println("GIVEN STRING INPUT VALUE IS -->"+sc);                                     //HERE WE GWT INPUT FROM USER
	
      //NOW WE WANT TO REVERCE THAT STRING
      //PUNE....(WE REVERCING OF PUNE)
      
      String rev=" ";
      
      for(int i=sc.length()-1;i>=0;i--)
      {
    	  rev=rev+sc.charAt(i);

    	  //LOGIC--> 
    	  //INDEX OF I IS 3-->rev=" "+E==E              (BLANK SPACE LA E PLACE HOIL)
    	  //INDEX OF I IS 2-->rev=E+N==EN             (THEN E+I VALUE E ALREADY ASEL ANI N VALUE ADD HOIL)
    	  //INDEX OF I IS 1-->rev=EN+U==ENU
    	  //INDEX OF I IS 0-->rev=ENU+P==ENUP
    	    	  
      }
      System.out.println("REVERCE STRING IS---->"+rev);
	
	
	}

}
