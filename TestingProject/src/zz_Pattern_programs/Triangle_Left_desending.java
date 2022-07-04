//TO PRINT STAR PATTERN TRIANGLE IN LEFT IN DESENDING MANNER


package zz_Pattern_programs;

public class Triangle_Left_desending 
{
    //******
    //*****
	//****
	//***
	//**
	//*
	
	public static void main(String[] args) 
	{
    int star=5;
    
    for(int i=1;i<=5;i++)
    {
      for(int j=1;j<=star;j++)

      {
         System.out.print("*");
      }
      System.out.println();
      star--;
    
    }
	}

}
