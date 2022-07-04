//WAP TO PRINT TRIANGLE STAR PATTERN. 

package h_loopingStatement;

public class ForLoop8_HW
{
 public static void main(String[] args)
 {
	int i;               //i for row
	int j;           //j for column
	int row=6;

	
	 
	for(i=0;i<row;i++)
	{
		for(j=0;j<=i;j++)
		{
				
			System.out.println("*");
		}
			
		System.out.println("");
	}

	}

}
