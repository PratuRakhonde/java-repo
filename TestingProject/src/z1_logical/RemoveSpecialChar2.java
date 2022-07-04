// REMOVING SYMBOLS FROM #$acc##@@&enture (BY Abhishek Sir)

package z1_logical;

public class RemoveSpecialChar2 
{

	public static void main(String[] args) 
	{
     String a="#$acc##@@&enture";
     
      System.out.println("AFTER REMOVING SPECIAL SYMBOLS-->"+a.replaceAll("[^a-z]",""));
	}

}
