
// Some programs with Exceptions:

// Exceptions are events that disrupt the program's normal flow but can often be recovered. 
// Exceptions are represented by the Exception class and can be handled using try-catch blocks.

// When Exceptions Occur:

//  - Checked Exceptions: Occur at compile time and must be handled 
//                (e.g., IOException, SQLException).

//  - Unchecked Exceptions: Occur at runtime and can optionally be handled 
//             (e.g., NullPointerException, ArithmeticException).

// // NullPointerException Example: Generated when the user not allocated memory for object, and
//                  calling the method using that object reference.


public class NullPointerExceptionExample {
public static void main(String[] args) {
    String text = null; // Null reference
    System.out.println(text.length()); // Attempt to access null
}
}