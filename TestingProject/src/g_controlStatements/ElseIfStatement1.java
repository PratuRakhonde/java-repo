//WAP TO PRINT GRADE OF STUDENT IF GRADE IS == 'A' THEN PRINT RESULT IS IN BETWEEN 90-100, IF GRADE IS =='B'   THEN PRINT RESULTIS IN BETN 80-90 , 
//IF GRADE IS =='C' THEN PRINT RESULT IS IN BETN 70-80,IF GRADE IS =='D' THEN PRINT RESULT IS IN BETN  60-70.
package g_controlStatements;

public class ElseIfStatement1
{

	public static void main(String[] args)
	{
     char Grade='D';
     
     if(Grade=='A')
     {
    	 System.out.println(" RESULT IS ABOVE 90");
     }
     else if(Grade=='B')
     {
    	 System.out.println(" RESULT IS IN BETWEEN  80-90");
    	 
     }
     else if(Grade=='C')
     {
    	 System.out.println(" RESULT IS IN BETWEEN  70-80");
    
     }
     else if(Grade =='D')
     {
    	 System.out.println(" RESULT IS IN BETWEEN 60-70");
     }
     }
	}
	


