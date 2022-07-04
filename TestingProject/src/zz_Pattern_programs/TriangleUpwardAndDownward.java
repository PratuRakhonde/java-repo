package zz_Pattern_programs;

public class TriangleUpwardAndDownward
{

	public static void main(String[] args)
	{
	
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
	
		//ROW=9
		//STAR=5
		
		int star =5;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<5)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
		
		
		
	}

}
