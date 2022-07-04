package z1_logical;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
	   //num=123-->321
		
		int num=123;
		//TO CONVERT INT TO STRING
		
		String original=Integer.toString(num);
		String reverce="";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			reverce=reverce+original.charAt(i);
		}
		
		System.out.println(reverce);                             //HERE WE GET REVERCE IN STRING FORMATE.
		
		int revnum=Integer.parseInt(reverce);                   //HERE WE CONVERT (REVERCE) STRING IN TO INTEGER.
		
		System.out.println("ORIGINAL NUMBER IS--> "+num);
		System.out.println("REVERCE NUMBER IS--> "+revnum);
		

	}

}
