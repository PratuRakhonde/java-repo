package zzz_Logical_Programs;

public class Pallindrom_Program 
{

	public static void main(String[] args) 
	{
	
		String Original="MADAM";
		String Reverce=" ";
		
		for(int i=Original.length()-1;i>=0;i--)

		{
			Reverce=Reverce+Original.charAt(i);
			System.out.println("ORIGINAL STRING =="+Original);
			System.out.println("REVERCE STRING=="+Reverce);
			
			if(Original.equals(Reverce));
		    {
		    	System.out.println("==GIVEN STRING IS PALINDROM==");
		    }
		   
		    {
		    	System.out.println("==GIVEN STRING IS NOT PALINDROM==");
	
			}
		    
			
			
		    
		
		
		}
	}

}
