//MULTIPLICATION WITHOUT MULTIPLICATION OPERATOR

package z1_logical;

public class MultiplicationOf2No
{

	public static void main(String[] args) 
	{
		int num1=5;
		int num2=6;
		int sum=0;
		
		for(int i=1;i<=num2;i++)
		{
			sum=sum+num1;
			//LOGIC
			//INDEX ==>0--0+5=5
			//1--5+5=10
			//2--10+5=15
			//3--15+5=20
			//4--20+5=25
			//5--25+5=30
		}
		
		System.out.println("MULTIPLICATION OF GIVEN TWO NUMBER IS--->"+sum);
	}

}
