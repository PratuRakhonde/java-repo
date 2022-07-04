package z1_logical;

public class WhiteSpaceCount 
{

	public static void main(String[] args) 
	{
	   String s="Pratiksha";
	   String s1="P r a t i k s h a";
	   int count=0;
	   
	   for(int i=0;i<=s1.length()-1;i++)
	   {
		   char space=' ';
		   char mychar=s1.charAt(i);
		   
		   if(mychar==space)
		   {
			   count++;
			   
		   }
		   System.out.println("NUMBER OF WHITE SPACES IN GIVEN STRING ARE-->"+count);
	   }
		

	}

}
