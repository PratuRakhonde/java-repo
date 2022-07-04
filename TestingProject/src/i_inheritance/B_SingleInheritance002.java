package i_inheritance;

public class B_SingleInheritance002 
{

	public static void main(String[] args) 
	{
		B_SingleInheritance002 sl=new B_SingleInheritance002();
		sl.Books();
		sl.Books1();
		
		B_SingleInheritance sg=new B_SingleInheritance();
		sg.Notebooks();
		sg.Notebooks2();
		sg.Books();
		sg.Books1();

	}
	public void Books ()
	{
	    
		System.out.println("Biograohy");
		System.out.println("Litrechure");
		
	}
	public void Books1()
	{
		 
		System.out.println("Polity");
		 
	}

}
