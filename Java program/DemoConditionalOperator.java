
import java.util.Scanner;
class DemoConditionalOperator
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int x=0,y=0;

		System.out.println("\n Enter any two nos: ");
		x=sc.nextInt();
		y=sc.nextInt();

		int z = (x>y) ? x : y ;
		System.out.println("\n Max no: "+z);
	}
}