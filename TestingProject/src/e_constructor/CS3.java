package e_constructor;                  // with parameter

public class CS3
{
	int a;
	int b;
	int c;
	
	public CS3()
	{
	  a=10;
	  b=20;
	  c=30;
	}
    
	public CS3 (int x)
	{
	a=x;
	}
    public CS3(int x,int y)
   
    {
     a=x;
     b=y;
    }
    public CS3(int x,int y, int z)
    {
    	a=x;
    	b=y;
    	c=z;	
    }
	public static void main(String[] args)
	{
    CS3 c=new CS3();
    c.sum();
    
    CS3 c1=new CS3(100);
    c1.sum();
    	
    CS3 c2=new CS3(105,200);
    c2.sum();
    
    CS3 c3=new CS3(1000,250,390);
    c3.sum();
   }
   public void sum()
   {
	   int sum=a+b+c;
	   System.out.println("ADDITION IS ="+sum);
	   
   }
}
