
public class DemoNesting {

    public static void main(String []args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);

		if(a>b)
		{
			if(a>c)
			{
				System.out.println("\n a is max");
			}
			else
			{
				System.out.println("\n c is max");
			}
		}	
		else
		{
			if(b>c)
			{
				System.out.println("\n b is max");
			}
			else
			{
				System.out.println("\n c is max");
			}
		}
	}

}