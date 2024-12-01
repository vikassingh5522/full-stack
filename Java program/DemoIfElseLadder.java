import java.util.Scanner;
class DemoIfElseLadder
{
	public static void main(String []args)
	{
        Scanner sc=new Scanner(System.in);
        int x=0,y=0;

    		System.out.println("\n Enter the x cord: ");
    		x=sc.nextInt();
    		System.out.println("\n Enter the y cord: ");
    		y=sc.nextInt();

    		if(x>0&&y>0)
    		{
        		System.out.println("\n Point present in I st qd");
    		}
    		else if(x<0&&y>0)
    		{
        		System.out.println("\n point present in II nd qd");
    		}
    		else if(x<0&&y<0)
    		{
        		System.out.println("\n Point is present in 3 rd qd");
    		}
    		else if(x>0&&y<0)
    		{
        		System.out.println("\n Point is present in 4 th qd");
    		}
    		else if(x!=0&&y==0)
    		{
        		System.out.println("\n Point is present on x axis");
    		}
    		else if(x==0&&y!=0)
    		{
        		System.out.println("\n Point is present on y axis");
    		}
    		else 
    		{
        		System.out.println("\n Point present at org");
    		}
	}
}
