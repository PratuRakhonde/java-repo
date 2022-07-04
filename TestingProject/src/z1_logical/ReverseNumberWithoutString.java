//PROGRAM FOR REVERSING THE NUMBER WITHOUT USING STRING..

package z1_logical;

public class ReverseNumberWithoutString
{

	public static void main(String[] args)
	{
     //NUMBER =123-->321
		
		int num=123;
		int rev=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem =i%10;
			rev=rev*10+rem;
			
		}
		System.out.println("ORIGINAL NUMBER IS-->"+num);
		System.out.println("REVERCE OF GIVEN NUMBER IS-->"+rev);
		
		
	}

}
