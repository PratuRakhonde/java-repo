package e_constructor;

public class CSwithpara 
{
	int a;
	int b;
	int c;
	
	public CSwithpara()
	{
	a=10;
	b=20;
	c=30;
	}
	 public CSwithpara(int x)
	 {
	  a=x;
	 }
	public CSwithpara(int x,int y)
	{
		a=x;
		b=y;
	}
	public CSwithpara(int x,int y,int z)
	{
	a=x;
	b=y;
	c=z;
	}
    
	public static void main(String[] args)
	{
     CSwithpara s=new CSwithpara();
     s.sub();
     
     CSwithpara s1=new CSwithpara(100);
     s1.sub();
     
     CSwithpara s2 =new CSwithpara (100,200);
     s2.sub();
     
     CSwithpara s3 =new CSwithpara(100,200,300);
     s3.sub();
    		 
     
     
	}
    public void sub()
    {
    	int sub=a-b-c;
    	System.out.println("substraction is ="+sub);
    }
}
