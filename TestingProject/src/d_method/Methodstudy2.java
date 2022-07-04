package d_method;
                                          // calling static method from another class
public class Methodstudy2                                     
{
   public static void main(String[] args)
	{
      mul();
      div();
      Methodstudy1.method1();
      Methodstudy1 m=new Methodstudy1();
      m.method2();
      
      
	}

 public static void div()
{
	// TODO Auto-generated method stub
	  
	int a;
	int b;
	 
	a=2;
	b=5;
	 
	int div;
	 
	div=a/b;
	System.out.println("division is ="+div);
	
}

public static void mul() 
{	
	int x;
	int y;
	
	x=5;
	y=5;
	
	int mul;
	
	mul=x*y;
	
	System.out.println("multiplication is ="+mul);
	
	
}

}
