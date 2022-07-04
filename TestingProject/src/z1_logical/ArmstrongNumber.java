//TO FIND GIVEN  NUMBER IS ARMSTRONG OR NOT.

package z1_logical;

public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
		//371
		
		//3^3+7^3+1^3=371--->Armstrong number
		
		int org=371;
		int num=0;
//		
//		System.out.println(371/10);  //HER IF WE TAKE 432/10=43-->43/10=4
//        System.out.println(371%10);	
//		
		for(int i=org;i>0;i=i/10)
		{
			int num1=i%10;
			
			num=num+(num1*num1*num1);
		}
        System.out.println("ORIGINAL NUMBER IS "+org);	
        System.out.println("addition of digit cube is "+num);
        
        if(org==num)
        {
        	System.out.println("GIVEN NUMBER IS ARMSTRONG");
        }
        else
        {
		     System.out.println("GIVEN NUMBER IS NOT ARMSTRONG NUMBER");	
		}
	}

}
