package d_method;                                   //calling non static function from another class

public class Methodstudyy {

	public static void main(String[] args)
	{
     method1();
     Methodstudyy m=new Methodstudyy();
     m.method2();                  
	}
   public static void method1()
   {
	   int a=5;
	   int b=5;
	   int sum=a+b;
	    
	   System.out.println("addition is ="+sum);
	   
   }
   public void method2 ()
   {
	   int x=5;
	   int y=5;
	   int sub=x-y;
	   
	   System.out.println("substraction is ="+sub);
	   
   }
}
