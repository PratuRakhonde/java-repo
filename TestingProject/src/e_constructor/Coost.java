package e_constructor;

public class Coost
{
   int a;
   int b;
   int c;

public Coost()
{
	a=10;
	b=20;
	c=30;
	
}
    public Coost(int x,int y, int z)
    {
    	a=x;
    	b=y;
    	c=z;
    	
    }
	public static void main(String[] args)
	{
    Coost q=new Coost(100,200,300);
    
    q.add();
    
    		
	}
 public void add()
 {
	 int sum=a+b+c;
	 System.out.println("addition is ="+sum);
 }
}
