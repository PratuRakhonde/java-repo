package f_globalAndLocalVariables;

public class GLV2 
{
	int a=19;
	int b=30;
	static int c=50;
	

	public static void main(String[] args) 
	{
		GLV2 x=new GLV2();
		x.add();
		substraction();
		System.out.println("VALUE OF VARIABLE a IS ="+x.a);
		System.out.println("VALUE OF VARIABLE b IS ="+x.b);
		System.out.println("VALUE OF VARIABLE c IS ="+c);
		
		
		GLV3 g=new GLV3();
		g.mul();
		GLV3.div();
		System.out.println("VALUE OF p IS ="+g.p);
		System.out.println("VALUE OF q IS="+g.q);
		System.out.println("VALUE OF rIS ="+GLV3.r);
		
		
	}
    public void add()
    {
     int sum=a+b;
     System.out.println("addition of two number is ="+sum);
     
    }
    public static void substraction()
    {
    	int sub=80-c;
    	System.out.println("substraction is ="+sub);
    	
    }
}
