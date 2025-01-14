class Sample
{
	private int x;
	private double y;
	public Sample() // Default constructor
	{
		System.out.println("\n In Default constructor of Sample class");
	}
	public Sample(int a1, double a2) // Parameterized constructor
	{
		System.out.println("\n In Para constructor of Sample class");
		x=a1;
		y=a2;
	}
	public void showData()
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class Mainparaex
{
	public static void main(String []args)
	{
		Sample ob = new Sample();
		ob.showData();

		Sample ob2 = new Sample(12,89.45);
		ob2.showData();

		System.out.println("\n In Main class");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the int value: ");
		int x=sc.nextInt();
		System.out.println("Enter the double value: ");
		double y=sc.nextDouble();
		Sample ob3 = new Sample(x,y);
		ob3.showData();
	}
}