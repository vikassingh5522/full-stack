


// class Example
// {
// 	static int x;		// we not decl. as private,it is default, and accessible using 
// 	static double y;	// .operator directly. And we want to access directly for checking purpose.
// 	static boolean z;
// 	// ... some another members
// }
// class DemoStatic 
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("value of x: "+Example.x);
// 		System.out.println("value of y: "+Example.y);
// 		System.out.println("value of z: "+Example.z);
// 	}
// }






	// class with static initilizer

	class Example
	{
		static int x;		// we not decl. as private coz want to access directly
		static double y;	// for checking purpose
		static boolean z;

		static
		{
			z=true;
			x=5;
			y=x*x/3.0;
			System.out.println("\n In Static Block");
		}
		// ... some another members
	}
	class DemoStatic 
	{
		public static void main(String[] args) 
		{
			System.out.println("value of x: "+Example.x);
			System.out.println("value of y: "+Example.y);
			System.out.println("value of z: "+Example.z);
		}
	}




		// A class with multiple static Blocks

// class Example
// {
// 	static int x;		// we not decl. as private coz want to access directly
// 	static double y;	// for checking purpose
// 	static boolean z;

// 	static
// 	{
// 		z=true;
// 		System.out.println("\n In Static Block-1");
// 	}	
// 	static
// 	{
// 		x=5;
// 		System.out.println("\n In Static Block-2");
// 	}	
// 	static
// 	{
// 		y=x*x/3.0;
// 		System.out.println("\n In Static Block-3");
// 	}
// 	// ... some another members
// }
// class DemoStatic 
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("value of x: "+Example.x);
// 		System.out.println("value of y: "+Example.y);
// 		System.out.println("value of z: "+Example.z);
// 	}
// }





// static block with try-catch (handling exception in static block)

// class Example
// {
// 	static int x;
// 	static int t;		// we not decl. as private coz want to access directly
// 	static double y;	// for checking purpose
// 	static boolean z;

// 	static
// 	{
// 		z=true;
// 		t=2;  // try with t=0
// 		System.out.println("\n In Static Block-1");
// 	}	

// 	static
// 	{
// 		try
// 		{
// 			x=23/t;
// 		}
// 		catch (Exception e)
// 		{
// 			System.out.println("\n Unable to init x, so init to default value");
// 		}
// 		System.out.println("\n In Static Block-2");
// 	}	
	
// 	static
// 	{
// 		y=x*5.7/x;
// 		System.out.println("\n In Static Block-3");
// 	}
// 	// ... some another members
// }
// class DemoStatic 
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("value of x: "+Example.x);
// 		System.out.println("value of y: "+Example.y);
// 		System.out.println("value of z: "+Example.z);
// 	}
// }
