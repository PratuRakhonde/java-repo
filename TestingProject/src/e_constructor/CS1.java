package e_constructor;

public class CS1
{
	int a;
	int b;
	

	public static void main(String[] args) 
	{
	       CS1 c =new CS1();
           c.sub();
           
	}
    CS1()
    {
    	a=500;
    	b=100;
    	
    	System.out.println("welcome to constructor ");
    	
    }
   public void sub()
   {
	   int sub=a-b;
	   System.out.println("substraction is ="+sub);
	   
   }
	
	
}
