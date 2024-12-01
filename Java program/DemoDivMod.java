import java.util.Scanner;
class DemoDivMod
{
	public static void main(String []args)
	{
		int no=0,rem=0,tot=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("\n Enter any 3 digit number: ");
		no=sc.nextInt(); //285
	
		rem=no%10; //5
		tot=tot+rem; // 0+5=5
		no=no/10; //28
	
		rem=no%10; //8
		tot=tot+rem; // 5+8=13
		no=no/10; //2	

		rem=no%10; //2
		tot=tot+rem; // 13+2=15
		no=no/10; //0

		System.out.println("\n Total is "+tot);
	}		
} 
