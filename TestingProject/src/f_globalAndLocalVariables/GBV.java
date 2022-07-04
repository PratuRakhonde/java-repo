 package f_globalAndLocalVariables;

public class GBV 
{
  int a=10;
  int b=10;
  static int c=12;
  static int d=10;
  
	public static void main(String[] args)
	{
		add();
		GBV a=new GBV();
		a.sub();

	}
	public static void add()
	{
     int sum=c+d;
     
     System.out.println("ADDITION  IS ="+sum);
     
	}
   public void sub()
   {
	   int sub=a-b;
	   System.out.println("substraction is ="+sub);
	   
	   int sub1=c-d;
	   System.out.println("substraction is ="+sub1);
	   
	   
   }
}
