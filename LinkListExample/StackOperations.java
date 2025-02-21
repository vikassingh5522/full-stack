// implement stack operations using LinkedList

import java.util.LinkedList;
import java.util.Scanner;

public class StackOperations {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Display Stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    String element = scanner.nextLine();
                    stack.push(element); // Push element onto the stack
                    System.out.println("Pushed: " + element);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        String poppedElement = stack.pop(); // Pop element from the stack
                        System.out.println("Popped: " + poppedElement);
                    } else {
                        System.out.println("Stack is empty. Nothing to pop.");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        String topElement = stack.peek(); // Peek at the top element of the stack
                        System.out.println("Top element: " + topElement);
                    } else {
                        System.out.println("Stack is empty. Nothing to peek.");
                    }
                    break;
                case 4:
                    System.out.println("Is the stack empty? " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Stack: " + stack);
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }        
        scanner.close();
    }
}
