




// Using this keyword: 

// In Java, the this keyword is a reference to the current object within a class. It is 
// commonly used in methods, constructors, and inner classes to distinguish between instance 
// variables and parameters or to call other constructors or methods within the same class.

// Here are some common uses

// 1. Returning the Current Object: 'this' always refers to invoking object(object
// on which method is called). Some times we need to return it from method defined within same class
// in that case 'this' used as shown below..!!

// import java.util.Scanner;
// class Person
// {
// 	private int id;
// 	private String name;
// 	private int age;
// 	private double salary;
// 	public void setData()
// 	{
// 		Scanner sc = new Scanner(System.in);

// 		System.out.println("Enter the Name: ");
// 		name = sc.nextLine();

// 		System.out.println("Enter the ID: ");
// 		id = sc.nextInt();

// 		System.out.println("Enter the Age: ");
// 		age = sc.nextInt();

// 		System.out.println("Enter the Salary: ");
// 		salary = sc.nextDouble();
// 	}
// 	public void showData()
// 	{
// 		System.out.print("\n ID: "+id+"\t Name: "+name+"\t Age: "+age+"\t Salary: "+salary);
// 	}
// 	public Person findElder(Person x)
// 	{
// 		if(x.age>age)
// 			return x;
// 		else 
// 			return this;
// 	}
// }
// class ThisEx
// {
// 	public static void main(String[] args) 
// 	{
// 		Person p1 = new Person();
// 		p1.setData();

// 		Person p2 = new Person();
// 		p2.setData();

// 		System.out.println("\n Person List");
// 		p1.showData();
// 		p2.showData();

// 		Person t = p1.findElder(p2);		
// 		System.out.println("\n Elder Person ");
// 		t.showData();
// 	}
// }


// ----------------------------------------------------------------------------------------------------------------------------

// 2. Referring to Instance Variables: When method or constructor parameters have the same name as instance 
// variables, this helps differentiate between the two.

// import java.util.Scanner;
// class Person
// {
// private int id;
// private String name;
// private int age;
// private double salary;
// public Person()
// {
//    id = -1;
//    name = "NA";
//    this.age = -1;
//    this.salary = -1.0;
// }
// public Person(int id, String name, int age, double salary)
// {
//    this.id = id;
//    this.name = name;
//    this.age = age;
//    this.salary = salary;
// }
// public void setData()
// {
//    Scanner sc = new Scanner(System.in);

//    System.out.println("\n Enter the Name: ");
//    name = sc.nextLine();

//    System.out.println("Enter the ID: ");
//    id = sc.nextInt();

//    System.out.println("Enter the Age: ");
//    age = sc.nextInt();

//    System.out.println("Enter the Salary: ");
//    salary = sc.nextDouble();
// }
// public void setData(int id, String name, int age, double salary)
// {
//    this.id = id;
//    this.name = name;
//    this.age = age;
//    this.salary = salary;
// }
// public void showData()
// {
//    System.out.print("\n\n ID: "+id+"\t Name: "+name+"\t Age: "+age+"\t Salary: "+salary);
// }
// }
// class ThisEx
// {
// public static void main(String[] args) 
// {
//    Person p1 = new Person();
//    p1.showData();

//    p1.setData();

//    Person p2 = new Person();
//    p2.setData(11,"Abhay",23,12.34);

//    System.out.println("\n Person List");
//    p1.showData();
//    p2.showData();
// }
// }


// -------------------------------------------------------------------------------------------------------------------------------- -

// 3. Calling Another Constructor (Constructor Chaining): The this keyword can be used to call 
// 	   another constructor within the same class.

// import java.util.Scanner;
// class Person
// {
// 	private int id;
// 	private String name;
// 	private int age;
// 	private double salary;
// 	public Person()
// 	{
// 		this(-1,"NA",-1,-1.0); // constructor chaining
// 	}
// 	public Person(int id, String name)
// 	{
// 		this(id,name,-1,-1.0); // constructor chaining
// 	}

// 	public Person(int id, String name, int age, double salary)
// 	{
// 		this.id = id;
// 		this.name = name;
// 		this.age = age;
// 		this.salary = salary;
// 	}
	
// 	public void setData(int id, String name, int age, double salary)
// 	{
// 		this.id = id;
// 		this.name = name;
// 		this.age = age;
// 		this.salary = salary;
// 	}

// 	public void showData()
// 	{
// 		System.out.print("\n\n ID: "+id+"\t Name: "+name+"\t Age: "+age+"\t Salary: "+salary);
// 	}
// }
// class ThisEx
// {
// 	public static void main(String[] args) 
// 	{
// 		Person p1 = new Person();

// 		Person p2 = new Person(11,"Abhay");

// 		Person p3 = new Person();
// 		p3.setData(131,"Anand",43,52.34);

// 		System.out.println("\n Person List");
// 		p1.showData();
// 		p2.showData();
// 		p3.showData();
// 	}
// }


// -----------------------------------------------------------------------------------+

// 4. Calling Current Class Methods: this can be used to explicitly call methods of the current object.

// import java.util.Scanner;
// class Person
// {
// 	private int id;
// 	private String name;
// 	private int age;
// 	private double salary;
// 	public Person()
// 	{
// 		this(-1,"NA",-1,-1.0); // constructor chaining
// 	}
// 	public Person(int id, String name)
// 	{
// 		this(id,name,-1,-1.0); // constructor chaining
// 	}

// 	public Person(int id, String name, int age, double salary)
// 	{
// 		this.id = id;
// 		this.name = name;
// 		this.age = age;
// 		this.salary = salary;
// 	}
	
// 	public void setData(int id, String name, int age, double salary)
// 	{
// 		this.id = id;
// 		this.name = name;
// 		this.age = age;
// 		this.salary = salary;
// 	}

// 	public void showData()
// 	{
// 		System.out.print("\n\n ID: "+id+"\t Name: "+name+"\t Age: "+age+"\t Salary: "+salary);
// 		System.out.print(" - Status: "+this.isWorking(this.salary));
// 	}
// 	private String isWorking(double sal)
// 	{
// 		if(sal>0)
// 			return "Working";
// 		else
// 			return "Not Working";
// 	}
// }
// class ThisExample
// {
// 	public static void main(String[] args) 
// 	{
// 		Person p1 = new Person();

// 		Person p2 = new Person(11,"Abhay");

// 		Person p3 = new Person();
// 		p3.setData(131,"Anand",43,52.34);

// 		System.out.println("\n Person List");
// 		p1.showData();
// 		p2.showData();
// 		p3.showData();
// 	}
// }


// ----------------------------------------------------------------------------------------------------------------------------------------------------------------

// // 5. Passing the Current Object as a Parameter: The this keyword can be passed as an argument to 
// methods or constructors.

import java.util.Scanner;
class Person
{
	private int id;
	private String name;
	private int age;
	private double salary;
	public Person()
	{
		this(-1,"NA",-1,-1.0); 
	}
	public Person(int id, String name)
	{
		this(id,name,-1,-1.0); 
	}

	public Person(int id, String name, int age, double salary)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void setData(int id, String name, int age, double salary)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void showData()
	{
		if(isWorking(this)) // display if working
			System.out.print("\n\n ID: "+id+"\t Name: "+name+"\t Age: "+age+"\t Salary: "+salary);
	}
	private boolean isWorking(Person p)
	{
		if(p.salary>0)
			return true;
		else
			return false;
	}
}
class ThisEx
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();

		Person p2 = new Person(11,"Abhay");

		Person p3 = new Person();
		p3.setData(131,"Anand",43,52.34);

		System.out.println("\n Person List");
		p1.showData();
		p2.showData();
		p3.showData();
	}
}
