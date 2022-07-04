//WAP TO PRINT ADDITION OF LOCAL VARIABLE IN SUM1 AND ADDITION OF GLOBAL VARIABLE IN SUM2.
//AND SAME FOR SUB1 AND SUB2
package l_thisAndSuperKeywords;

public class ThisStudy
{
	int a=500;
	int b=400;
	
	public static void main(String[] args)
	{
		ThisStudy t=new ThisStudy();
		t.test();
		t.test2();
	}
public void test()
{
	int a=100;
	int sum1=a+100;
	 System.out.println(" sum is ="+sum1);
	 int sum2=this.a+100;
	 System.out.println("Addition is="+sum2); 
}
public void test2()
{
	int b=200;
	int sub1=b-100;
	System.out.println("Substraction ="+sub1);
	int sub2=this.b-b;
	System.out.println("Substraction is ="+sub2);
}
}
