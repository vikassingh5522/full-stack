import java.util.Scanner;
class Array2DMulti
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int [][]x=new int[3][3];
		int [][]y=new int[3][3];
		int [][]z=new int[3][3];
		int i,j,k;

		System.out.println("Enter array of 3x3: \n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				x[i][j]=sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Enter another array of 3x3: \n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				y[i][j]=sc.nextInt();
			}
			System.out.println();
		}

		// multi.
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				z[i][j]=0;
				for(k=0;k<x[i].length;k++)
				{
					z[i][j]=z[i][j]+(x[i][k]*y[k][j]);
				}
			}
		}
		
		System.out.println("\n Array elements are: \n");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.print("\t");
			for(j=0;j<y[i].length;j++)
			{
				System.out.print("  "+y[i][j]);
			}
			System.out.print("\t");
			for(j=0;j<z[i].length;j++)
			{
				System.out.print("  "+z[i][j]);
			}
			System.out.println();
		}
	}
}