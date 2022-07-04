package e_constructor;

public class Employee
{

	public static void main(String[] args)
	{
     HRPortal MSDhoni =new HRPortal();
     MSDhoni.emp_name="Mahendra";
     MSDhoni.emp_ID=07;
     MSDhoni.emp_sal=1234567.123f;
     MSDhoni.emp_position="CEO";
     MSDhoni.emp_gender='M';
     
     MSDhoni.emp_info();
     
     HRPortal VKohli=new HRPortal();
     VKohli.emp_name="Virat";
     VKohli.emp_ID=18;
     VKohli.emp_sal=12345.321f;
     VKohli.emp_position="Manager";
     VKohli.emp_gender='M';
     
     VKohli.emp_info();
     
	}

}
