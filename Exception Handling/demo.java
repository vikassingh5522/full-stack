


// What is Exception Handling?

// Exception handling is a mechanism in programming to handle runtime errors gracefully and 
// maintain the normal flow of a program. It involves detecting errors, taking corrective 
// action, and recovering from unexpected situations without crashing the program.

// In Java, exception handling is achieved using the following keywords:

// - try: Defines a block of code to monitor for exceptions.
// - catch: Handles the exception if one occurs in the try block.
// - finally: Contains code that executes regardless of whether an exception was thrown or not.
// - throw: Used to explicitly throw an exception.
// - throws: Declares exceptions that a method might throw.
// 1}

// public class demo {
//     public static void main(String[] args) {
        
//         System.out.println("\n in main method  od demo ");

//         int a=10, b=0 ,c;
//         c=a/b;
//         System.out.println("value of c is "+c);
//     }
// }

//  in main method  od demo 
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at demo.main(demo.java:10)


// 2}

public class demo {

    public static void main(String[] args) {
        System.out.println("\n in main method  start ");

        int a=10, b=0 ,c;
        try{
            c=a/b;
            System.out.println("\n value of c is "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("can not div by zero");
        }
        System.out.println("\n in main method  end ");
    }

}