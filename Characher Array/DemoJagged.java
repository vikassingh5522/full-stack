// 	// Variable size Array or Jagged Array

// 	suppose, you decl. an array as,

// 		int [][]x=new int[3][];

// 	then see the memory map is as shown below,

// 		x
// 		[ ] --------->  [ ]
// 				[ ]
// 				[ ]
// 			  These all 3 are the references, which will able to refer
// 			  dynamically created location of correct type, having any SIZE. 

// 	Means to store data, we need to allocate memory for each location. So we need to
// 	write it as,
	
// 		x[0]=new int[5];
// 		x[1]=new int[7];
// 		x[2]=new int[4];

// 		x
// 		[ ] --------->  [ ] -------> [][][][][]
// 				[ ] -------> [][][][][][][]
// 				[ ] -------> [][][][]

// 	So Note that, In Jagged array(variable size array) size(length) of every row
// 	may be different.

// lets see the example.






// 	We have to create a 2D array to store runs of N player scored in M matches. where
// 	M may be different for each player.

import java.util.Scanner;
class DemoJagged
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("\n Enter the player count: ");
		int pcnt = sc.nextInt();

		int [][]data = new int[pcnt][];

		System.out.println("\n Enter the details of "+pcnt+" Players");
		for(int i=0;i<data.length;i++)
		{
			System.out.println("\n Enter the march count of player "+(i+1)+": ");

			int mcnt=sc.nextInt();
			data[i] = new int[mcnt];
            
			System.out.println("\n Enter the runs scored by player: ");
			for(int j=0;j<data[i].length;j++)
			{
				System.out.println("\n Match "+(j+1)+": ");
				data[i][j]=sc.nextInt();
			}
		}

		System.out.println("\n Score Board");

		int i=1;
		for(int []p : data)
		{
			System.out.print("\n Player "+(i++)+": ");
			for(int r : p)
			{
				System.out.print("  "+r);
			}
			System.out.println();
		}
	}
}