
import java.util.Scanner;
class Number
{
	private int no;
	public void setNumber(int n) 
	{
		no=n;
	}
	public int getNumber()
	{
		return no;
	}
	public int findReverse()
	{
		int n=no;

		int rev=0;
		while(n!=0)
		{
			rev = (rev*10) + (n%10);
			n = n/10;
		}
		return rev;
	}
	public char isPalindrome()
	{
		if(no==findReverse())
			return 'y';
		else
			return 'n';
	}
	public String isEvenOrOdd()
	{
		if(no%2==0)
			return "even";
		else
			return "odd";
	}
	public void isPrime()
	{	
		int d=2,flg=0;
		while(d<=(no/2))
		{
			if(no%d==0)
			{
				flg=1;
				break;
			}
			d++;
		}
		if(flg==0)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");
	}
	public int findMax(int h)
	{
		int ans = (no>h) ? no : h;
		return ans;
	}
}

class DemoNumber
{
	public static void main(String []args)
	{
		Number nob = new Number();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int t=sc.nextInt();

		nob.setNumber(t);

		System.out.println("\n Number is: "+nob.getNumber());

		int r = nob.findReverse();
		System.out.println("\n Reverse Number is: "+r);

		char ans=nob.isPalindrome();
		if(ans=='y')
			System.out.println("\n Number is Palindrome");
		else
			System.out.println("\n Number is Not Palindrome");

		System.out.println("\n Number is: "+nob.isEvenOrOdd());

		nob.isPrime();

		System.out.println("Enter the Number: ");
		int k=sc.nextInt();

		int max=nob.findMax(k);
		System.out.println("max Number: "+max);
	}
}
