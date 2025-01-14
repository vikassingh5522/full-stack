
import java.util.*;

class sample
{
    private int x;
    private Double y;
    public sample()
    {
        System.out.println("\n In default constructor of sample class:");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the int vale :");
        x=sc.nextInt();
        System.out.println("\n Enter the double vale :");
        y=sc.nextDouble();
    }  
    public sample(int a)
    {
        System.out.println("\n In parameter constructor-1of sample class:");
        x=a;
        y=a;
    }
    public sample(int a1, Double a2)
    {
        System.out.println("\n in parameter constructor-2 of sample class:");
         x=a1;
         y=a2;
     }
     public void showData()
     {
        System.out.println("\n x="+x+" y="+y);
     }
}

public class MainConOverloading {
     public static void main(String[] args)
     {
        sample ob =new sample();
        ob.showData();

        sample ob2 = new sample(12);
        ob2.showData();

        System.out.println("\n Main class:");
        Scanner sc =new Scanner(System.in);
        System.out.println("\n Enter the int value :");
        int x = sc.nextInt();
        System.out.println("\n Enter the double value :");
        double y = sc.nextDouble();
        sample ob3 =new sample(x,y);
        ob3.showData();
     }
}



// -------------------------------
// class Sample
// {
// 	private int x;
// 	private double y;
// 	public Sample() // Default constructor
// 	{
// 		System.out.println("\n In default constructor of Sample class");
// 		java.util.Scanner sc = new java.util.Scanner(System.in);
// 		System.out.println("Enter the int value: ");
// 		x=sc.nextInt();
// 		System.out.println("Enter the double value: ");
// 		y=sc.nextDouble();
// 	}
// 	public Sample(int a) // Parameterized constructor
// 	{
// 		System.out.println("\n In Para constructor-1 of Sample class");
// 		x=a;
// 		y=a;
// 	}
// 	public Sample(int a1, double a2) // Parameterized constructor
// 	{
// 		System.out.println("\n In Para constructor-2 of Sample class");
// 		x=a1;
// 		y=a2;
// 	}
// 	public void showData()
// 	{
// 		System.out.println("\n x="+x+"\t y="+y);
// 	}
// }
// class MainConOverloading
// {
// 	public static void main(String []args)
// 	{
// 		Sample ob = new Sample();
// 		ob.showData();

// 		Sample ob2 = new Sample(12);
// 		ob2.showData();

// 		System.out.println("\n In Main class");
// 		java.util.Scanner sc = new java.util.Scanner(System.in);
// 		System.out.println("Enter the int value: ");
// 		int x=sc.nextInt();
// 		System.out.println("Enter the double value: ");
// 		double y=sc.nextDouble();
// 		Sample ob3 = new Sample(x,y);
// 		ob3.showData();
// 	}
// }