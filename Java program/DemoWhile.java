import java.util.Scanner;

public class DemoWhile {
    public static void main(String[] args) {
       {
		Scanner sc=new Scanner(System.in);

		System.out.println("\n Enter any no: ");
		int no=sc.nextInt();
		int d=2;
		int flg=0;
		while(d<=(no/2))
		{
			if(no%d==0)
			{
				flg=1;
				break;
			}
			d++;
		}
		if(flg==0)
		{
			System.out.println("\n Entered no is prime ");
		}
		else
		{
			System.out.println("\n Entered no is not prime ");
		}
	}
    }
}
