package imp_Programs;

public class Palindrom_Number {

	public static void main(String[] args)
	{
       int no=131;
       int temp=no;
       int rev=0,rem;
       
       while(temp!=0)
       {
    	   rem=temp%10;
    	   rev=rev*10+rem;
    	   
       }
       if(no==rev) 
       {
    	System.out.println("PALINDROM NUMBER IS "+no);   
       }
       else
       {
       	System.out.println("NUMBER IS NOT PALINDROM "+no);   

       }
	}

}
