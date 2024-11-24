
import java.util.Scanner;
class InputUsingScannerObject
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		String str="";
		int x=0;
		double db=0.0;
		char ch='$';

		System.out.println("Enter any String: ");
		str=sc.nextLine();

		System.out.println("Enter any int value: ");
		x=sc.nextInt();

		System.out.println("Enter any double value: ");
		db=sc.nextDouble();

		System.out.println("Enter any character: ");
		ch=sc.next().charAt(0);

		System.out.println("String str: "+str);
		System.out.println("int value: "+x);
		System.out.println("double value: "+db);
		System.out.println("char value: "+ch);		
	}
}