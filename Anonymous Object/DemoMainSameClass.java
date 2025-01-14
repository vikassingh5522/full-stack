
/* 
class DemoMainSameClass
{
	private int x=1;
	private double y=2.2;
	public static void main(String []args)
	{
		System.out.println("\n main() started");
        
		
		System.out.println("\n x="+x);
		System.out.println("\n y="+y);

		System.out.println("\n main() end");
	}
}
    */


// DemoMainSameClass.java:10: error: non-static variable x cannot be referenced from a static context
//                 System.out.println("\n x="+x);
//                                            ^
// DemoMainSameClass.java:11: error: non-static variable y cannot be referenced from a static context
//                 System.out.println("\n y="+y);
//                                            ^
// 2 errors



// class DemoMainSameClass
// {
// 	private int x=1;
// 	private double y=2.2;
// 	public static void main(String []args)
// 	{
// 		System.out.println("\n main() started");
		
// 		DemoMainSameClass ob1 = new DemoMainSameClass();
// 		System.out.println("\n ob1.x="+ob1.x);
// 		System.out.println("\n ob1.y="+ob1.y);
		
// 		DemoMainSameClass ob2 = new DemoMainSameClass();
// 		System.out.println("\n ob2.x="+ob2.x);
// 		System.out.println("\n ob2.y="+ob2.y);

// 		System.out.println("\n main() end");
// 	}
// }



// another ways is decl thode variablrs as static 

class DemoMainSameClass
{
	private static int x=1;
	private static double y=2.2;

	public static void main(String[] args)
	{
		System.out.println("\n main() started");

		System.out.println("\n x="+x);
		System.out.println("\n y="+y);
		System.out.println("\n main() end");
	}

}

 