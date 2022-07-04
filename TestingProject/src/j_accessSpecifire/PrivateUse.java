package j_accessSpecifire;

public class PrivateUse
{
	int a=4;
	private int b=5;
	public int c=6;
	protected static int d=7;
	
	public static void main(String[] args) 
	{
		PrivateUse p=new PrivateUse();
		p.add();
		p.sub();
		p.mul();
		display();
		
		System.out.println("VALUE OF VARIABLE a ="+p.a);
		System.out.println("VALUE OF VARIABLE b ="+p.b);
		System.out.println("VALUE OF VARIABLE c ="+p.c);
		System.out.println("VALUE OF VARIABLE d ="+PrivateUse.d);
		
	}
   private void add()
   {
	int add,b=10,c=20;
	add=b+c;
	System.out.println("Addition is  ="+add);
   }
   public void sub()
   {
	   int sub,b=30,c=15;
	   sub=b-c;
	   System.out.println("Substraction is  ="+sub);
   }
   void mul()
   {
	  int mul,b=2;c=2;
	  mul=b*c;
	  System.out.println("Multiplication is ="+mul);
   }
   protected static void display()
   {
	  System.out.println("Hii I AM Protected Method"); 
   }
}
