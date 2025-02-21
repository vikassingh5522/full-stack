import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a Queue (using LinkedList)
        Queue<String> queue = new LinkedList<>();

        // Insert elements into the Queue
        queue.add("Apple");
        queue.offer("Banana");
        queue.add("Cherry");
        queue.offer("Date");

        // Display the queue
        System.out.println("Queue after insertion: " + queue);

        // Remove elements from the Queue
        System.out.println("Removed element (remove()): " + queue.remove());  // Removes and returns "Apple"
        System.out.println("Queue after remove(): " + queue);

        // Poll an element (remove() but returns null if empty)
        System.out.println("Removed element (poll()): " + queue.poll());  // Removes and returns "Banana"
        System.out.println("Queue after poll(): " + queue);

        // Peek the head element (without removing)
        System.out.println("Peek the head (peek()): " + queue.peek());  // Returns "Cherry" without removing it
        System.out.println("Queue after peek(): " + queue);

        // Check the head element (without removing) using element()
        System.out.println("Element at the head (element()): " + queue.element());  // Returns "Cherry" without removing it
    }
}
