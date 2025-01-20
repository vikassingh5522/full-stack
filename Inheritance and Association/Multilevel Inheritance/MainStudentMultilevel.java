
// - Multilevel Inheritance:

// 		[ ] Person		in() and out()	
// 		 |				 
// 		 |				 
// 	  	[ ] Student		input() and output()
// 		 |
// 		 |
// 		[ ] Sport		set() and show()




import java.util.Scanner;


class Person
{
	private String nm="";
	private int age;
	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the name of person: ");
		nm=sc.nextLine();

		System.out.println("\n Enter the age of person: ");
		age=sc.nextInt();
	}
	public void out()
	{
		System.out.println("\n Name: "+nm+"\t age: "+age);
	}
}
class Student extends Person
{
	private int rno;
	private double per;
	protected void input()
	{
		//in();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the rno of Student: ");
		rno=sc.nextInt();

		System.out.println("\n Enter the percentage of Student: ");
		per=sc.nextDouble();
	}
	public void output()
	{
		//out();
		System.out.println("\n RNO: "+rno+"\t Percentage: "+per);
	}
}
class Sport extends Student
{
	private int points;
	void set()
	{
		//in();
		//input();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the grade points of Student: ");
		points=sc.nextInt();
	}
	public void show()
	{
		out();
		output();
		System.out.println("\n Points: "+points);
	}
}
class MainStudentMultilevel
{
	public static void main(String []args)
	{
		Sport s=new Sport();
		s.in();
		s.input();
		s.set();
		s.show();	
	}
}
