//PROGRAM TO REMOVE SPECIAL CHARECTER FROM GIVEN STRING

package z1_logical;

public class RemoveSpecialChar
{

	public static void main(String[] args) 
	{
     String a="Pratiksha@";
     String b="123Pratu@13";
     
     System.out.println("AFTER REMOVING THE SYMBOL WE GET-->"+a.replace("@"," "));      //THIS IS TO REMOVE ONLY SINGLE SYMBOL
     
     //HOW TO REMOVE MULTIPLE SYMBOLS AND DIGITS
     
     System.out.println("After Removing Symbols And Characters We Get-->"+b.replaceAll("[^a-zA-Z]", ""));
		//^HERE WE USE a-z A-Z BECAUSE EXPECT THOSE ALPHABATES WE ONLY WANT TO REMOVE SYMBOLS AND DIGITS
     
     System.out.println("After Removing Alphabates and Symbols We Get-->"+b.replaceAll("[^0-9]", ""));
		
	}

}
