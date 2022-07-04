package f_globalAndLocalVariables;

public class GBV1 
{
	int a=10;
	int b=20;
	static int c=30;
	static int d=40;
	
			
public static void main(String[] args) 
	{
	sub();
	System.out.println("Value of variable is "+GBV1.c);
	System.out.println("Value of variable is "+GBV1.d);
	
	GBV1 a=new GBV1();
	a.add();
	System.out.println("value of variable is "+a.a);
	System.out.println("value of variable is "+a.b);
	
	GLV3 q=new GLV3();
	q.mul();
	System.out.println("value of p is "+q.p);
	System.out.println("value of q is "+q.q);
	
	
	GLV3.div();
	System.out.println("value of r is "+GLV3.r);
	
	}
public static void sub()
{
	int sub=d-c;
	System.out.println("substraction is ="+sub);
	
}
   public void add()
   {
	   int sum=a+b;
	   System.out.println("Addition is "+sum);
	   
	   int sum1=c+d;
	   System.out.println("addition is "+sum1);
	   
   }
}
