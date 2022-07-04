package zzz_Logical_Programs;

public class Reverce_Number 
{

	public static void main(String[] args)
	{
    int Number=12345;
    int reverce=0;
    
    for(int i=0;Number!=0;Number/=10)
    {
     int Remain=Number%10;
     reverce=reverce*10+Remain;
    
    }
    System.out.println("REVERCE OF NUMBER 12345 IS =="+reverce);
	}

}
