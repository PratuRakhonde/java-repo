package zz_Pattern_programs;

public class Triangle_Right_Dessending 
{
   
	//******
	// *****
	//  ****
	//   ***
	//    **
	//     *
	
	public static void main(String[] args)
	{
    int space=0;
    int star=6;
    
    for(int i=1;i<=6;i++)
    {
    	for(int j=1;j<=space;j++)
    	{
    		System.out.print(" ");
    	}
    	for(int j=1;j<=star;j++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    	space++;
    	star--;
    }
		
		
	}

}
