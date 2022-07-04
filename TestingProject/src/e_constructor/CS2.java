package e_constructor;

public class CS2 
{
    int a;
    int b;
    
	public static void main(String[] args)
	
	{
		CS2 c1=new CS2();
		c1.sum();
		
     
	}
    CS2()
    {
    	a=10;
    	b=40;
    	
    	System.out.println("WELCPME TO CONSTRUCTOR ");
    	
    }
    public void sum()
    {
    	int sum=a+b;
    	
    	
    	System.out.println("ADDITION OF TWO NUMBERS IS="+sum);
    	
    }
}
