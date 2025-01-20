
class DemoRefPassImmutable
{
	public static void fun(final String s3, final String s4)
	{
		s3="good day";
		s4="bye bye";
	}
	public static void main(String[] args) 
	{
		String s1="Hi";
		String s2="Hello";
		System.out.println("Before Call: s1 - "+s1+"\t s2 - "+s2);
		fun(s1,s2);
		System.out.println("After Call: s1 - "+s1+"\t s2 - "+s2);
	}
}



// It will gives like output same as that of(or like) "By Value", due to String Object is immutable.

// // To avoid it, use final


 //------- on compile ----------

//  DemoRefPassImmutable.java:5: error: final parameter s3 may not be assigned
//  s3="good day";
//  ^
// DemoRefPassImmutable.java:6: error: final parameter s4 may not be assigned
//  s4="bye bye";
//  ^
// 2 errors
// Press any key to continue . . .
