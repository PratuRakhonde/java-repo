//PROGRAM TO CHECK WHETHER GIVEN NUMBER IS EVEN OR ODD.

package z1_logical;

import java.util.Scanner;

public class EvenAndOddNum
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("VALUE OF a IS-->");
		int a=sc.nextInt();
		int b=2;
		
		if(a%b==0)
		{
			System.out.println("GIVEN NUMBER IS EVEN");
		}
		else
		{
			System.out.println("GIVEN NUMBER IS ODD");	
		}
	}

}
