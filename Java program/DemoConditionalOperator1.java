import java.util.Scanner;

class DemoConditionalOperator1 {
    public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int x=0,y=0,z=0;

		System.out.println("\n Enter any three nos: ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();

		int max = (x>y) ? (x>z?x:z) : (y>z?y:z) ;
		System.out.println("\n Max no: "+max);
	}
}
