package l_thisAndSuperKeywords;

public class ThisStudy1 extends SuperStudy
{ 
	int a=200;

	public static void main(String[] args)
	{
		ThisStudy1 ts=new ThisStudy1();
		ts.sample();
		ts.test();

		
     
	}
public void sample()
{
	int a=10;
	
	int sub1=a-10;
	int sub2=this.a-10;
	int sub3=super.a-10;
	
	System.out.println("subsraction1 is ="+sub1);
	System.out.println("substraction2 is ="+sub2);
	System.out.println("substraction3 is ="+sub3);
	
}
}
