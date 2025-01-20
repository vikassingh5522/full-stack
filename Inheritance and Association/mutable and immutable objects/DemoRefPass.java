
class DemoRefPass 
{
	public static void fun(String s3, String s4)
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