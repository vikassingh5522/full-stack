
// Another way to represent the data in its equivalent object from is to use Wrapper classes

class SwapDemoUsingObjUsingWrapper
{
	public static void swap(Integer  oba, Integer obb)
	{
		int tmp;
		tmp=oba;
		oba=obb;
		obb=tmp;
	}
	public static void main(String[]args)
	{
		int x=10, y=20;

		Integer obx = x;
		Integer oby = y;

		System.out.println("\n Before Interchange x="+obx+"\t y="+oby);
		swap(obx,oby);
		System.out.println("\n After Interchange x="+obx+"\t y="+oby);
	}
}

// The output will not gives the swaped values coz Integer object is immutable. You need mutable object
// or use the array. 

// 	The values of x and y are not swapping because:

// 	- Java passes object references by value.
// 	- The swap method only modifies the local copies of the references.
// 	- Integer objects are immutable, so their values cannot be changed directly.


// 	NOTE:
// 	- When you pass a primitive type (e.g., int, float, char) to a method, a copy of the value is  passed. Changes made to the parameter inside the method do not affect the original variable.


// 	- When you pass an object to a method, a copy of the reference to the object is passed. This 
// 	  means that the method receives a reference to the same object, but the reference itself is a copy.


// 	- Changes made to the object through the reference inside the method will affect the original object. 
// 	  However, changes made to the reference itself (e.g., assigning it to a new object) will not affect 
// 	  the original reference.



