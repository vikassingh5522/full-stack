
class Base
{
	private int x=11;
	protected int y=22;
	int z=33; // default visibility
	public int t=44;
    double d=47.45;
	// and some methods
}
class Derived extends Base
{
	public void display()
	{
		// System.out.println("\n x="+x);
		System.out.println("\n y="+y);
		System.out.println("\n z="+z);
		System.out.println("\n t="+t);
        System.out.println("\n d="+d);

    }
}

class MainAccessSingle1
{
	public static void main(String []args)
	{
		Derived ob = new Derived();
		ob.display();

		// System.out.println("\n x="+ob.x);
		System.out.println("\n y="+ob.y);
		System.out.println("\n z="+ob.z);
		System.out.println("\n t="+ob.t);
        System.out.println("\n d="+ob.d);
	}
}