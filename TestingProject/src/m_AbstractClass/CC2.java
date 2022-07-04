package m_AbstractClass;

public class CC2 extends AbstractStudy2 
{

	public static void main(String[] args) 
	{
        CC2 ab =new CC2();
        ab.method1();
		ab.method();
		
		CC2 c=new CC2();
		c.testes();
   
	}

	@Override
	public void method1() 
	{
    System.out.println("METHOD1 FROM ABSTACT CLASS COMPLETED IN CC2 CLASS");		
	}
	public void testes()
	{
		System.out.println("METHOD OF THIS CLASS");
	}
	
 
}
