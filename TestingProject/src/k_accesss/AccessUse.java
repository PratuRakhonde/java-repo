package k_accesss;

import j_accessSpecifire.PrivateUse;

public class AccessUse extends PrivateUse
{

	public static void main(String[] args)
	{
		PrivateUse p=new PrivateUse();
	    p.sub();
	    System.out.println("value of c is ="+p.c);
	    System.out.println("value of d is ="+PrivateUse.d);
	    
	}
    
}
