class A
{
	int a;
	public A()
	{
		System.out.println("\n In default constructor of A class");
		a=10;
	}
	public A(int a)
	{		
		System.out.println("\n In para constructor of A class");
		this.a=a;
	}
	public void showa()
	{
		System.out.println("\n a="+a);
	}
}
class B extends A
{
	int b;
	public B()
	{
		System.out.println("\n In default constructor of B class");
		b=20;
	}
	public B(int a, int b)
	{		
		super(a);
		System.out.println("\n In para constructor of B class");
		this.b=b;
	}
	public void show()
	{
		showa();
		System.out.println("\n b="+b);
	}
}
class ChainConSuper
{
	public static void main(String []args)
	{
		B ob1 = new B();
		ob1.show();

		B ob2 = new B(100,200);
		ob2.show();
	}
}