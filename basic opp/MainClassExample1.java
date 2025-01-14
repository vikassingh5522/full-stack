
import java.util.*;

class person {
	private String name;
	private String Address;
	private int age;
	private double hig;
	private double weight;

	public void setPersonDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Enter the name:");
		 name = sc.nextLine();

		System.out.println("\n Enter the address:");
	     Address = sc.nextLine();

		System.out.println("\n Enter the age:");
		age = sc.nextInt();

		System.out.println("\n Enter the hight:");
		hig = sc.nextDouble();

		System.out.println("\n Enter the weight:");
		weight = sc.nextDouble();
	}

	public void displayDetails() {
		System.out
				.println("\n Name: " + name + "\t  Address: " + Address + "\t  age: " + age + " \t  weight:" + weight);
	}

}

public class MainClassExample1 {
	public static void main(String[] args) throws Exception 
	 {

		person p = new person();

		p.setPersonDetails();
		p.displayDetails();

	}

}