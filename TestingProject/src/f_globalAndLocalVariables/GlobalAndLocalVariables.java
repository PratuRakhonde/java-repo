package f_globalAndLocalVariables;

public class GlobalAndLocalVariables 
{
  int a=10;
  int b=20;
  static int c=30;
  static int d=40;
  
  
	public static void main(String[] args) 
	{
		substraction();
		GlobalAndLocalVariables gb=new GlobalAndLocalVariables();
		gb.addition();
	}
    public void addition()
    {
    	int sum1=a+b;
    	int sum2=c+d;
    	
    	System.out.println("addition of first two no is ="+sum1);
    	System.out.println("addition of second two no is ="+sum2);
    }
    public static void substraction()
    {
    	int sub=c-d;
    	System.out.println("substraction is ="+sub);
    }
}
