package e_constructor;

public class Cs4
{
	int a;
	int b;
	int c;
	
	public Cs4()
	 {
		 a=2;
		 b=2;
		 c=2;
	 }
      public Cs4(int x)
      {
        a=x;
    	  
      }
      public Cs4(int x,int y)
      {
      a=x;
      b=y;
      }
      public Cs4(int x,int y,int z)
      {
    	  a=x;
    	  b=y;
    	  c=z;
      }
	public static void main(String[] args)
	{
		Cs4 c=new Cs4();
		c.mul();
		
		Cs4 c1=new Cs4(2);
		c1.mul();
		
		Cs4 c2=new Cs4(2,2);
		c2.mul();		
		
		Cs4 c3=new Cs4(2,2,2);
		c3.mul();
		

	}
    public void mul()
    {
    	int mul=a*b*c;
    	System.out.println("Multiplication Is ="+mul);  	
    }
}
