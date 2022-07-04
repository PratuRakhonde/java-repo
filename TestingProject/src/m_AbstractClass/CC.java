package m_AbstractClass;

public  class CC extends AbstractStudy

{

	public static void main(String[] args) 
	{
    CC c=new CC();
    c.test();
    c.test1();
	}

	@Override
	public void test()
	{
      System.out.println("TEST METHOD OF ABSTRACT CLASS COMPLETED IN CONCREAT CLASS");		
	}

}
