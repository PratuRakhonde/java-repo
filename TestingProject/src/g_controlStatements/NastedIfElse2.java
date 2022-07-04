//WAP TO PRINT IF PIN IS CORRECT THEN PRINT WITHDRAW MONEY ELSE CHECK PIN 
//IF WITHDRAW MONEY SUCCESSFULL THEN PRINT TRANSICTION IS SUCCESSFULL ELSE CHECK WITHDRAW MONEY.

package g_controlStatements;

public class NastedIfElse2 
{
 public static void main(String[] args)

 {
  int pin=1234;
  int money=1000;
   
  if(pin==1234)
  {
	  System.out.println("WITHDRAW MONEY");
	  
	  if(money==1000)
	  {
		  System.out.println("WITHDRAW MONEY SUCCESSFULL");
	  }
        
	 else
	 {
	     System.out.println(" CHECK WITHDRAW MONEY");
			  
	 }
  }
  else
  {
		System.out.println("CHECK PIN"); 
	  
  }
 }
}

