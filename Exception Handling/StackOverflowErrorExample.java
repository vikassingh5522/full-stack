public class StackOverflowErrorExample {
    public static void recursiveCall() {
        recursiveCall(); // Infinite recursion
    }

    public static void main(String[] args) {
        try {
            recursiveCall();
        } catch (StackOverflowError e) {
            System.out.println("Error: Stack overflow occurred!");
        }
    }
}


// // StackOverflowError: When the call stack size exceeds due to excessive recursion.

// A StackOverflowError in Java occurs when the application’s call stack exceeds its limit. 
// The call stack is a special memory area used to store method calls, local variables, and 
// other information related to active methods in a program. When the stack runs out of space, 
// the JVM throws a java.lang.StackOverflowError.

// The error typically results from excessive recursion or deep method call hierarchies. 
// Here's a breakdown of common causes:
// - Infinite Recursion
// - Excessive Recursion
// - Cyclic Method Calls
// - Deep Call Chains