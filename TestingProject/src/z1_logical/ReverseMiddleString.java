//Here We Want To Reverse The String Present In middle 

package z1_logical;

public class ReverseMiddleString 
{

	public static void main(String[] args)
	{
     String sample="pratu yashu tanu";
     String[]ar=sample.split(" ");
     
     System.out.println(sample);
     
     for(int i=0;i<=ar.length-1;i++)
     {
    	    if(i%2==0)
    	    {
    	    	String s=ar[i];
    	    	ar[i]=revString(s);
    	    }
    	    else
    	    {
			System.out.println(ar[i]+" ");	
			}
     }
	}

	public static String revString(String input) 
	{

		String rev=" ";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		
		return rev;
	}


}
