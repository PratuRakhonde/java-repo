//TO PRINT STAR PATTERN TRIANGLE IN LEFT IN ASSENDING MANNER

package zz_Pattern_programs;

public class Triangle_Left_Asse 
{

	//*
	//**
	//***
	//****
	//*****
	//******
	public static void main(String[] args)
	{
		int star=1;
		
        for(int i=1;i<=6;i++)
        {
        	for(int j=1;j<=star;j++) 
        	{
            	System.out.print("*");
        		
        	}
        	System.out.println();
            star++;
        }
		
	}

}
