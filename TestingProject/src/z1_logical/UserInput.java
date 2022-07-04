//TO GET INPUT FROM USER BY USING SCANNER CLASS

package z1_logical;

import java.util.Scanner;

public class UserInput
{

	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		
		System.out.println("ENTER VALUE OF A==>");
		int a= s.nextInt();
		System.out.println("ENTER VALUE OF A==>");
        int b=s.nextInt();
        
        int sum= a+b;
        System.out.println("ADDITION IS==>"+sum);
		
		
		
	}

}
