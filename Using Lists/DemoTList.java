// Usint generics (<T>) to specify the type of elements.(Type-safe)


// Restricted arraylist of <T>
import java.util.*;
class DemoTList
{
	public static void main(String[] args) 
	{
		ArrayList<String> stringlist = new ArrayList<>();
		stringlist.add("hello");
		// stringlist.add(56);  // error
		stringlist.add("all");
		// stringlist.add(2.3); // error

		System.out.println("String List: "+stringlist);
	}
}



// DemoTList.java:12: error: incompatible types: int cannot be converted to String
//                 stringlist.add(56);  // error
//                                ^
// DemoTList.java:14: error: incompatible types: double cannot be converted to String
//                 stringlist.add(2.3); // error
//                                ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors