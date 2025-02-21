
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push operations: " + stack);

        // Popping an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop operation: " + stack);

        // Peeking the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Searching for an element (returns 1-based index, or -1 if not found)
        int position = stack.search(10);
        System.out.println("Position of 10 in stack: " + position);
    }
}

