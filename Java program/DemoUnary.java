import java.util.Scanner;

public class DemoUnary
{
    public static void main(String[] args)
    {
         int x=0;
         int y=0;
         int z=0;

         Scanner sc= new Scanner(System.in);
        System.out.println("\n Enter the values of x and y:");
        x=sc.nextInt();
        y=sc.nextInt();

        z=-x;
        x++;
        --y;
        System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

		z=++x+y--;
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);



    }
}