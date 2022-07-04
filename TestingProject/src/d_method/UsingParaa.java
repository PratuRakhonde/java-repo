package d_method;

public class UsingParaa 
{

	public static void main(String[] args) 
	{
     SI();
     SI();
     
     UsingParaa b=new UsingParaa();
     b.SI("Pratu", 345, "9876543221", 'F');
     
     
     UsingParaa b1=new UsingParaa();
     b1.SI("ranjit", 234, "88888888888", 'M');
     

	}
	public static void SI()
	{
		String name="Shubham";
		int rollno=123;
		String mono="1234567890";
		char gender='M';
		
		System.out.println("*****************************");
		System.out.println("student name is ="+name);
		System.out.println("roll number is ="+rollno);
		System.out.println("mo number is ="+mono);
		System.out.println("gender is ="+gender);
		System.out.println("******************************");
	}
   public void SI(String name,int rollno,String mono,char gender)
   {
	   System.out.println("student name is ="+name);
		System.out.println("roll number is ="+rollno);
		System.out.println("mo number is ="+mono);
		System.out.println("gender is ="+gender);
		System.out.println("******************************");
   }
}
