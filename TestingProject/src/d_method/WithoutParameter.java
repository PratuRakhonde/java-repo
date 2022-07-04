package d_method;

public class WithoutParameter 
{

	public static void main(String[] args)
	{
     addition();
     WithoutParameter a=new WithoutParameter();
     a.substraction(30, 15);
     WithoutParameter a1=new WithoutParameter();
     a1.substraction(20, 10);
     

	}
	public static void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		
		System.out.println("Addition of two number is ="+sum);
		
	}
    public void substraction(int a,int b)
    {
    	int sub=a-b;
    	
    	System.out.println("Sbstrsction is ="+sub);
    	
    }
}
