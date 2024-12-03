
import java.util.Scanner;
class I2dArray
{
	public static void main(String []args)
	{
		int [][]ar = new int[3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("\n Array elements are");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(" "+ar[i][j]);
			}
			System.out.println();
		}
	}
}