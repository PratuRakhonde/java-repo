// WAP YOU ARE A BSc STUDENT THEN ENTER YOUR YEAR
// CASE1. YOU ARE IN FIRST YEAR
//CASE2. YOU ARE IN SECOND YEAR
//CASE3. YOU ARE IN THIRD YEAR

package g_controlStatements;

public class SwitchStatement1
{
	public static void main(String[] args)
	{
	 int year=3;
	 
	 switch (year)
	 {
	 case 1:
	 System.out.println("I AM IN FIRST YEAR");
	 break;
	 
	 case 2:
     System.out.println("I AM IN SECOND YEAR");
     break;
     
	 case 3:
	 System.out.println("I AM IN THIRD YEAR");
	 break;
	 
	 default :
	 System.out.println("INVALID YEAR");
     break;
     
	 }


	}

}
