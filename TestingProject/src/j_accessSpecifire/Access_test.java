package j_accessSpecifire;

public class Access_test
{
  public static void main(String[] args)
  {
	  PrivateUse p=new PrivateUse();
		                                                                                      //p.add();//private method
		p.sub();
		p.mul();
		                                                                                      //display();
		
		System.out.println("VALUE OF VARIABLE a ="+p.a);
		                                                            //System.out.println("VALUE OF VARIABLE b ="+p.b);//private variable
		System.out.println("VALUE OF VARIABLE c ="+p.c);
		System.out.println("VALUE OF VARIABLE d ="+PrivateUse.d);
			
  }

}
