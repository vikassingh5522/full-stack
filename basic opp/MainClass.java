class Demo
{
	private int x;
	public void in(){
		x=100;
	}
	public void out(){
		System.out.println("x="+x);
	}
}
class MainClass
{
	public static void main(String []args)
	{
		Demo ob = new Demo();

		ob.in();
		ob.out();
	}
}