class DemoLogical
{
	public static void main(String []args)
	{
		int x=23,y=5;
		boolean b;
		System.out.println("\n x is: "+x+"\t y is: "+y);

		b=(x>y)&&(y<100);
		System.out.println("\n ((x>y)&&(y<100)) is: "+b);

		b=(x>y)&&(y>100);
		System.out.println("\n ((x>y)&&(y>100)) is: "+b);

		b=(x>y)||(y>100);
		System.out.println("\n ((x>y)||(y>100)) is: "+b);

		b=(x<y)||(y>100);
		System.out.println("\n ((x<y)||(y>100)) is: "+b);

		b=!(x!=y);
		System.out.println("\n (!(x!=y)) is: "+b);

		b=!(y<1);
		System.out.println("\n (!(y<1)) is: "+b);
		
	}
}