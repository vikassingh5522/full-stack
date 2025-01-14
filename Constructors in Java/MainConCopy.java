import java.util.*;

class Sample
{
	private int x;
	private double y;
	public Sample() // Default constructor
	{
		System.out.println("\n In default constructor of Sample class");
		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the int value: ");
		x=sc.nextInt();
		System.out.println("Enter the double value: ");
		y=sc.nextDouble();
	}
	public Sample(int a) // Parameterized constructor
	{
		System.out.println("\n In Para constructor-1 of Sample class");
		x=a;
		y=a;
	}
	public Sample(int a1, double a2) // Parameterized constructor
	{
		System.out.println("\n In Para constructor-2 of Sample class");
		x=a1;
		y=a2;
	}
	public Sample(Sample t) // copy constructor
	{
		System.out.println("\n In copy constructor of Sample class");
		x=t.x;
		y=t.y;
	}
	public void showData()
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class MainConCopy
{
	public static void main(String []args)
	{
		Sample ob = new Sample();
		ob.showData();

		Sample ob2 = new Sample(12);
		ob2.showData();

		System.out.println("\n In Main class");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the int value: ");
		int x=sc.nextInt();
		System.out.println("Enter the double value: ");
		double y=sc.nextDouble();
		Sample ob3 = new Sample(x,y);
		ob3.showData();

		Sample ob4 = new Sample(ob3);
		ob4.showData();
	}
}
