import java.util.Scanner;
class Student
{
	private int id;
	private double per;
	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student ID: ");
		id=sc.nextInt();

		System.out.println("Enter the Percentage: ");
		per=sc.nextDouble();
	}
	public void in(int t1, double t2)
	{
		id=t1;
		per=t2;
	}
	public void out()
	{
		System.out.println("\n Student ID: "+id+"\n Percentage: "+per);
	}
}
class DemoStudent1
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		Student s1=new Student();
		s1.in();
		s1.out();
		//-----------------------------------------------

		// System.out.println("Enter the student ID: ");
		// sid=sc.nextInt();
		// System.out.println("Enter the Percentage: ");
		// sper=sc.nextDouble();
		// Student s2=new Student();
		// s2.in(sid,sper);
		// s2.out();
	}
}	

// In above program, there are two different copies of in() method i.e.

// 		public void in()
// 		public void in(int t1, double t2)

// 	as a class contains two copies of function having same name and differ in terms of
// 	signature, it is known as "Method Overloading"