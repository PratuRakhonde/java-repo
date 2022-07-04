 package j_accessSpecifire;

public class DefaultUse
{
	 int a=10;
	 public int b=20;
	 private int c=12;
	 protected  int d=33;
	 
	 public static void main(String[] args)
	{
		 
		 
		 DefaultUse d=new DefaultUse();
		 d.test();
		 d.test1();
		 d.test2();
		 d.test3();
		 System.out.println("VALUE OF VARIABLE a is ="+d.a);
		 System.out.println("VALUE OF VARIABLE a is ="+d.b);
		 System.out.println("VALUE OF VARIABLE a is ="+d.c);
		 System.out.println("VALUE OF VARIABLE a is ="+d.d);
		
		 
		 DefaultUse2.add();
		 DefaultUse2 d1=new DefaultUse2 ();
		 d1.add1();
		 d1.add2();
		 //d1.add3();private method of another class
		 System.out.println("VALUE OF VARIABLE a is ="+d1.x);
		 System.out.println("VALUE OF VARIABLE a is ="+d1.y);
		 //System.out.println("VALUE OF VARIABLE a is ="+d1.z); //private method 
		 
		 

	}
	 protected void test()
	 {
		 System.out.println("Hii I am Protected method");
	 }
   public void test1()
   {
	   System.out.println("Hii I am Public Test1 method");
   }
    void test2()
   {
	   System.out.println("Hii I am Public Test2 method");
   }
   private void test3()
   {
	   System.out.println("Hii I am public Test3 method");
   }
   
}
