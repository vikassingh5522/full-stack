
	// Note to Remember

	// - Private members are not inheritable.

class Sample
{
	private int x;
	public float y;
	double z;
	protected char ch;
}
class Test extends Sample
{
	public Test()
	{
		x=100; // error: x has private access in Sample
		y=3.4F;
		z=45.23;
		ch='w';
	}
}
class DemoTestAccess
{
	public static void main(String[] args) 
	{
		Test ob = new Test();
	}
}

// DemoTestAccess.java:17: error: x has private access in Sample
//                 x=100; // error: x has private access in Sample
//                 ^
// 1 error
