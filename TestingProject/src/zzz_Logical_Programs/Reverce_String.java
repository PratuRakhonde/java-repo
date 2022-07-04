//PROGRAM FOR REVERCE OF LETTERS.

package zzz_Logical_Programs;

public class Reverce_String 
{

	public static void main(String[] args)
	{
     String letters="PRATU";
     String reverce=" ";
     
     for(int i=letters.length()-1;i>=0;i--)
     {
    	 reverce=reverce+letters.charAt(i);
     }
     System.out.println("ORIGINAL STRING=="+letters);
     System.out.println("REVERCE OF STRING=="+reverce);
	}

}
