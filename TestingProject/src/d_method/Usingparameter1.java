package d_method;

public class Usingparameter1 {

	public static void main(String[] args)
	{
    studentinfo();
    Usingparameter1 u1=new Usingparameter1();
    u1.studentdata("Pratu" , 12, 23.6f, "9604173910", 'F');
    u1.studentdata("Nikita", 13, 23.4f, "1234567890", 'F');
    u1.studentdata("Ankit", 14, 25.2f, "0987654321", 'M');
	}
public static void studentinfo()
{
	String name="velocity";
	int rollno=12;
	float age=23.06f;
	String mono="1234567890";
	char gender='f';
	
	System.out.println("======================");
	System.out.println("std name ="+name);
	System.out.println("My roll no is ="+rollno);
	System.out.println("My age is ="+age);
	System.out.println("Mobile no is ="+mono);
	System.out.println("gender is ="+gender);
	System.out.println("======================");

}
public void studentdata(String name,int rollno,float age,String mono,char gender)
{
	System.out.println("My Name is ="+name);
	System.out.println("My Roll no is ="+rollno);
	System.out.println("My Age is ="+age);
	System.out.println("Mobile No. ="+mono);
	System.out.println("Gender ="+gender);
	System.out.println("========================");
	
}
{
	
}
}
