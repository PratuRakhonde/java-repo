package z1_logical;

import java.util.Scanner;

public class PalindromString 
{

	public static void main(String[] args)
	{
     Scanner s=new Scanner(System.in);
     
     System.out.println("PLEASE ENTER A STRING-->");
     
     String Original = s.next();
     String Reverse=" ";
     
      for(int i=Original.length()-1;i>=0;i--)
      {
    	  Reverse=Reverse+Original.charAt(i);
      }
      
      System.out.println("GIVEN STRING IS -->"+Original);
      System.out.println("REVERSE OF STRING IS-->"+Reverse);
      
      if(Original.equals(Reverse))
      {
    	  System.out.println("STRING IS PALINDROM" );
      }
      else
      {
    	  System.out.println("STRING IS NOT PALINDROM" );

      }
	}

}
