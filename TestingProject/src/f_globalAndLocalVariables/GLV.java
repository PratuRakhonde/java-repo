package f_globalAndLocalVariables;

public class GLV 
{
  int a=12;
  int b=20;
  static int c=20;
  
	public static void main(String[] args) 
	{
     GLV a=new GLV();
     a.addition();
     substraction();
     System.out.println("value of a is ="+a.a);
     System.out.println("value of b is ="+a.b);
     System.out.println("value of c is ="+c);
     
     
     Sample.display1();
     Sample x=new Sample();
     x.display();
     System.out.println("value of p is ="+x.p);
     System.out.println("value os q is ="+Sample.q);
     
  

	}
 public void addition()
 {
	 int sum=a+b;
	 int sum1=b+c;
	 System.out.println("addition is ="+sum);
    System.out.println("addition is ="+sum1);
 }
 public static void substraction()
 {
	 int sub =20-c;
	 System.out.println("substraction is ="+sub);
 }
}
