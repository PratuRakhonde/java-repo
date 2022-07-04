package f_globalAndLocalVariables;
                                      
public class GLV3
{
	int p=40;
	int q=50;
	static int r=60;
		
	public static void main(String[] args) 
	{
     GLV3 g=new GLV3();
     g.mul();
     div();
	}
   public void mul()
   {
	   int mul=p*q;
	   System.out.println("multiplication is ="+mul);
   }
   public static void div()
   {
	   int div=600/r;
	   System.out.println("division is ="+div);
	   
   }
}
