
import java.util.Scanner;
class Person
{
	private String name;
	private int age;
	private double hig;
	public void setPersonDetails(String nm, int ag, double h)
	{
		name=nm;
		age=ag;
		hig=h;
	}
	public void showPersonDetails()
	{
		System.out.println("Name: "+name+"\t Age: "+age+"\t Height: "+hig);
	}	
}

class MainClassExample2
{
	public static void main(String []args)
	{

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the name: ");
		String name=sc.nextLine();
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		System.out.println("Enter the height: ");
		double hig=sc.nextDouble();

		Person p1 = new Person();
		p1.setPersonDetails(name, age, hig);
		
		System.out.println("Enter the name: ");
		name=sc.nextLine();
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		System.out.println("Enter the height: ");
		hig=sc.nextDouble();

		Person p2 = new Person();
		p2.setPersonDetails(name, age, hig);


		p1.showPersonDetails();
		p2.showPersonDetails();
	}
}

