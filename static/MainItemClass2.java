import java.util.Scanner;
class Item
{
	private int icode;
	private double iprice;
	private static double tot;
	public void setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code of item: ");
		icode=sc.nextInt();
		System.out.println("Enter the price of item: ");
		iprice=sc.nextDouble();
		tot = tot + iprice;
	}
	public void showData()
	{
		System.out.print("\n Item Code: "+icode+"\t Price: "+iprice);
	}
	public static void showTotalBill()
	{
		System.out.println("\n Total Bill: "+tot);
	}
}
class MainItemClass2
{
	public static void main(String []args)
	{
		Item.showTotalBill();
		Item []list = new Item[3];
		
		System.out.println("Enter the details of five Items: ");
		for(int i=0;i<list.length;i++)
		{
			list[i]=new Item();
			list[i].setData();
		}

		System.out.println("\n Item List ");
		for(int i=0;i<list.length;i++)
		{
			list[i].showData();
		}
		Item.showTotalBill();
	}
}