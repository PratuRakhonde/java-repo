package d_method;                                          //static and non static method calling from same and another class
                                                          //method with out parameter

public class Test {

	public static void main(String[] args) 
	{
     mymethod();                                          //calling static method from same class-->only method name
     Methodstudyy.method1();                               // calling static method from another class-->class name.method name
     Test t=new Test();                                   //for non static method we need to create object->created object t
     t.mymethod2();                                       //calling non static method using object-->object name.method name(from same class)
     Methodstudyy s=new Methodstudyy();                   //created object for calling method from another class
     s.method2();
     
     
	}
    public static void mymethod()
    {
    	int a=10;
    	int b=20;
    	int mul=a*b;
    	 
    	System.out.println("multiplication is ="+mul);
    	
    }
    public void mymethod2()
    {
    	int x=5;
    	int y=5;
    	int div=x/y;
    	
    	System.out.println("dividion is ="+div);
    	
    }
}
