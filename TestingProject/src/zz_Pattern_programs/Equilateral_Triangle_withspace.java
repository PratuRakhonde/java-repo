//PROGRAM FOR EQUILATERAL TRIANGLE (STAR PATTERN)IN UPWARD DIRECTION WITH SPACE.


package zz_Pattern_programs;

public class Equilateral_Triangle_withspace
{
    
	//    *
	//   * *
	//  * * *
	// * * * *
	//* * * * *
	
	public static void main(String[] args)
	{
		int space=4;
		int star=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}

	}

}
