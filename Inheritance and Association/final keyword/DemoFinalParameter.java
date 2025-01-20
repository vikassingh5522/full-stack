
// 4. Final Parameters:
// When a parameter is declared as final in a method, it means that 
// the value of the parameter cannot be changed within the method.


class Demo
{
	private int x;
	public void in(final int t)
	{
		t=78; // error: final parameter t may not be assigned
		x=t;
	}
	public void show()
	{
		System.out.println("\n x="+x);
	}
}
class DemoFinalParameter
{
	public static void main(String []args)
	{
		Demo ob=new Demo();
		ob.in(100);
		ob.show();
	}
}
