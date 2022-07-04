package d_method;

public class Usingparameter {

	public static void main(String[] args)
	{
		addition();
		substraction();
		Usingparameter u=new Usingparameter();//object create
		u.multiplication(10, 20);
		u.multiplication(12, 2);
		
		Usingparameter um=new Usingparameter();
		um.division(5, 5);
	    um.division(22, 2);	
	}
    public static void addition()
    {
    	int a=10;
    	int b=20;
    	int sum=a+b;
    	 
    	System.out.println("addition is ="+sum);
    
    }
    public static void substraction()
    {
    	int c=20;
    	int d=10;
    	int sub=c-d;
    	System.out.println("sbstraction is ="+sub);
    	
    }
    public void multiplication(int x,int y)
    {
    	int mul=x*y;
    	
    	System.out.println("multiplication is ="+mul);
    	

    	
    }
    public void division(int p,int r)
    {
    	int div=p/r;
    	
    	System.out.println("division is ="+div);

    	
    }
}
