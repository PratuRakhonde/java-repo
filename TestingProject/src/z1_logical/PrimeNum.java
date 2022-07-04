//TO FIND WHETHER THE GIVEN NUMBER IS PRIME OR NOT
//PRIME NO MEANS THE NO WHICH DIVIDED BY 1 AND ITSELF ONLY [when we do devision and we get remainder 0 then that is not prime number and if we get any number in remainder then that is prime number]

package z1_logical;

public class PrimeNum 
{

	public static void main(String[] args)
	{
		int input=7;
		int count=0;
		
		for(int i=2;i<input;i++)
		{
			if(input%i==0)                                                                   //AFTER DIVISION IF WE GET 0 AS REMAINDER THEN THAT NUMBER IS NOT PRIME 
			{
				count++;
				//break;                                                                         //HERE AFTER INCREASING THE COUNT WE DINT NEET TO DO IT AGAIN
			}
				if(count==0)
				{
					System.out.println("THE GIVEN NUMBER "+input+" IS PRIME");
				}
				else
				 {
					System.out.println("THE GIVEN NUMBER "+input+" IS NOT PRIME");
				}
			}
			   
		}
	}
		
			
		
			
		
		
		
		
	


