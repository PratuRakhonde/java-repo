//SINGLE LEVEL INHERITANCE IN ANOTHE MAIN METHOD ( CLASS A_TwoWheeler Extends A_FourWheeler WHILE CREATING ANOTHE METHOD)

package i_inheritance;

public class A_ASingleInheritance001
{

	public static void main(String[] args)
	{
		A_FourWheeler fw=new A_FourWheeler();
		fw.BMW();
		fw.FERRARY();
		
		A_TwoWheeler tw=new A_TwoWheeler();
		tw.Activa();
		tw.RoyalEnfeild();
		tw.BMW();
		tw.FERRARY();
	}

}
