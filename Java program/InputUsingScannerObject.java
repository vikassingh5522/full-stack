import java.util.Scanner;



public class InputUsingScannerObject {

	public static void main(String[]args)
	{
         Scanner sc= new Scanner(System.in);
		 String str=" ";
		 int x=0;
		 double db=25.45;
		 char ch='$';


		 System.out.println(" Enter  the string:");
		 str =sc.nextLine();

		 System.out.println("\n Enter the number :");
	     x=sc.nextInt();

		 System.out.println("\n Enter the double num: " );
         db= sc.nextDouble();

		 System.out.println("\n enter the char:");
		 ch=sc.next().charAt(0);


		 System.out.println("\n String in  "+str);
		 System.out.println("\n number in "+x);
		 System.out.println("\n double in "+db);
		 System.out.println("\n char in "+ch);


		
		}
	}