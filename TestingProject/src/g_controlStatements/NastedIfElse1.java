//WAP TO PRINT IF UN IS CORRECT THEN ENTER PASSWORD ELSE PLEASE ENTER CORRECT UN 
//IF PASSWORD IS COREECT THEN PRINT LOGIN SUCCESSFUL ELSE PRINT INVALID PASSWORD.

package g_controlStatements;

public class NastedIfElse1 
{
	public static void main(String[] args)
	{
     String UN="Pratiksha";
     String Pass="Pratu@123";
     
     if(UN=="Pratiksha")
    {
     System.out.println("ENTER PASSWORD");
     
     if("Pratu@123"==Pass)
     {
     System.out.println("LOGIN SUCCESFULL");
     }
     else
     {
    	 System.out.println("INVALID PASSWORD");
     }
 	}
     else
     {
    	 System.out.println("PLEASE ENTER CORRECT UN");
     }
	}

}
