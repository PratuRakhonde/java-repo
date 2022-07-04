package d_method;                                      //calling static method from same class

public class Methodstudy1
{

	public static void main(String[] args) 
	{
		method1();
		Methodstudy1 m1=new Methodstudy1();
		m1.method2();
		

	}
	 public static void method1()
	 {
		 int a;
		 int b;
		 int sum;
		  
		 a=12;
		 b=31;
		 sum=a+b;
		  
		 System.out.println("addition is ="+sum);
	}
	  public  void method2 ()
	  {
		  int x;
		  int y;
		  int sub;
		  
		  x=321;
		  y=123;
		  sub=x-y;
		  
		  System.out.println("substraction is ="+sub);
		  
	  }
	  
}
