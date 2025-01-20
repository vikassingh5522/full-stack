// / Defining the constructors in inheritance

// 	In Java, When we write the constructors in base and child class, 
// 	- if we create the base class object, only base class constructor will be executed.
// 	- if we create an object of child class, then first base class constructor and then child
// 	  class constructor will be executed. again it confirms that memory is allocated for both 
// 	  child and base classes.
// 	- Bydefault default constructors of both classes are executed.
// 	- If we invoke the parameterized constructor of child class, then at start it will invoke the 
// 	  default constructor of base class and then parameterized constructor of child.

// 	So we need to use super keyword to invoke the parameterized constructor of base class.





class Person {

	//	fields
	private int uid;
	private String name;

	//	Constructors
	public Person() {
		uid = 0;
		name = "No Name";
	}

	public Person(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	
	// setter and getter methods
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Student extends Person {
	// fields
	private int rno;
	private double per;
	
	// Constructors
	public Student() {
		rno = 0;
		per = 0.0;
	}
	
	public Student(int uid, String name, int rno, double per) {
		super(uid, name); // calls the para. constructor of base(super) class
		this.rno = rno;
		this.per = per;
	}
	
	public Student(int rno, double per) {
		this.rno = rno;
		this.per = per;
	}

	// setter and getter methods
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
}
public class MainClassSingleInh {

	public static void main(String[] args) {
		
		// Creating Object Using Setter and Getter methods
		Student s1 = new Student();
		s1.setName("Amol");
		s1.setUid(12345);
		s1.setRno(12);
		s1.setPer(78.45);
		System.out.println("Name: "+s1.getName()+"\t UID: "+s1.getUid()+"\t RNO: "+s1.getRno()+"\t Marks: "+s1.getPer()+"%");

		System.out.println("\n -------------------------------------------- ");
		
		// Creating the Object using the default Constructor
		Student s2 = new Student();
		System.out.println("Name: "+s2.getName()+"\t UID: "+s2.getUid()+"\t RNO: "+s2.getRno()+"\t Marks: "+s2.getPer()+"%");

		System.out.println("\n -------------------------------------------- ");
				
		// Creating the Object using the default Constructor
		Student s3 = new Student(15, 98.23); 
		// here the parameterized constructor of child class Student is invoked, and automatically it will invoke the default constructor of base class.
		System.out.println("Name: "+s3.getName()+"\t UID: "+s3.getUid()+"\t RNO: "+s3.getRno()+"\t Marks: "+s3.getPer()+"%");
		
		System.out.println("\n -------------------------------------------- ");
		
		// to invoke the base class we need to pass the arguments first.
		Student s4 = new Student(495867,"Uday",15,98.23); 
		System.out.println("Name: "+s4.getName()+"\t UID: "+s4.getUid()+"\t RNO: "+s4.getRno()+"\t Marks: "+s4.getPer()+"%");
		
	}

}