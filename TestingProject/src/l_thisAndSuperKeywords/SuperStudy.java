package l_thisAndSuperKeywords;

public class SuperStudy 
{
	int a=500;
	

	public static void main(String[] args) 
	{
		SuperStudy ss=new SuperStudy();
		ss.test();
	
	}
public void test()
{
	int a=10;
	int sub=500-a;
	int sub1=500-this.a;
	
	System.out.println("substraction of superstudy is="+sub);
	System.out.println("substraction1 of superstudy is ="+sub1);
	
}

}
