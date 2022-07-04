package k_accesss;

import j_accessSpecifire.DefaultUse;

public class A extends DefaultUse

{

	public static void main(String[] args)
	{
		DefaultUse d1=new DefaultUse();
		d1.test1();
		System.out.println(d1.b);
     
		A a=new A();
		a.test();
		
		System.out.println(a.d);
		
	}

}
