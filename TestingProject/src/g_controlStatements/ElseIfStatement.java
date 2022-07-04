//WAP TO PRINT IF MARKS ARE GRETER THAN OR EQUAL TO THEN PRINT 75. IF MARKS ARE >= 60 THEN PRINT 1st CLASS
//IF MARKS ARE  >=40 THEN PRINT PASS IF MARKS ARE < 40 THEN PRINT FAIL.

package g_controlStatements;


public class ElseIfStatement
{
  public static void main(String[] args)
	{
	int marks=30;
    
    if(marks >=75)
    {
    System.out.println("RESULT IS DISTINCTION");
    }
    else if(marks>=60)
    {
    	System.out.println("RESULT IS 1 ST CLASS");
   	}
    else if (marks>=40)
    {
    	System.out.println("RESULT IS PASS ");
    }
    else if(marks<40)
    {
    System.out.println("RESULT IS FAIL");	
    }
	}

}
