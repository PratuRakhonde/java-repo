//PROGRAM FOR FACTORIZATION OF NUMBER...(LOGIC=HERE WE HAVE NUMBER 5 SO WE MULTIPLY IT LIKE-->1*2*3*4*5==120)

package z1_logical;

public class FactorialNum {

	public static void main(String[] args) 
	{
	int a=5;
	int fact=1;
	
	for(int i=a;i>=1;i--)
	{
		fact=i*fact;
	}
	System.out.println("FACTORIAL OF NUMBER "+a+" IS "+fact);
	}

}
