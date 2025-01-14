

import java.util.Scanner;
class Product
{
	private int id;	
	private static int tot;
	private String name;
	private double price;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
		tot+=this.price;
	}
	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Produce Details: ID: "+id+" Name: "+name+"\n Price: "+price;
	}

	public static float getTot() {
		return tot;
	}
}
class DemoProduct
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prduct count: ");
		int cnt = sc.nextInt();
		Product []p1 = new Product[cnt];

		int i=0;
		int id;
		String name="";
		double price;

		while(true) {
			System.out.println("Enter 1 insert and the 2 to display product details 3 to display total Bill: ");
			int opt = sc.nextInt();

			if(opt==1) {
				 System.out.println("Enter the id, name and price: ");
				 p1[i]=new Product();
				 id=sc.nextInt();
				 p1[i].setId(id);

				 name=sc.nextLine();
				 name=sc.nextLine();
				 p1[i].setName(name);

				 price=sc.nextDouble();
				 p1[i].setPrice(price);

				 i++;
			}
			else if (opt==2) {
				System.out.println("\n ----------- List of Product ---------- ");
				for(int j=0; j<i ; j++)	{
					System.out.println(p1[j]);
				}
			
			}
			else if (opt==3) {
				System.out.println("\n ----------- Pay Bill: "+Product.getTot()+" ---------- ");

			}
		}
	}
}