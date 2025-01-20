
	// // initializer blocks

	// In Java, initializer blocks are used to initialize instance variables or perform some setup operations when an 
	// object of the class is created. These blocks are executed as part of the object creation process, and they can 
	// be either instance initializer blocks or static initializer blocks, depending on their purpose.

	// - Types:
	// 	1. Instance Initializer Blocks
	// 	2. Static Initializer Blocks


	// // using Instance Initializer Blocks

	// 	- Definition: Instance initializer blocks are enclosed in curly braces {} but are not part 
	// 	  of any method.

	// 	- Purpose: They are used to perform instance-level initialization that is common across all 
	// 	 	   constructors of the class.

	// 	- Execution: Runs before the constructor and after the memory for the object is allocated.

	// 	- Order: Executed in the order they appear in the class definition, and they run after the 
	// 		 superclass constructor and before the subclass constructor.


	// Example 

class Example {
    int x;

    {
        // Instance initializer block
        x = 10;
        System.out.println("Instance initializer block executed");
    }

    Example() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        
        // Output:
        // Instance initializer block executed
        // Constructor executed
    }
}