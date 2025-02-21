import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListExample {

    public static void main(String[] args) {
        // Uncommenting this would throw exceptions, as the list is empty.
        // LinkedList<Integer> l1 = new LinkedList<>(); // Empty list
        // System.out.println(l1.remove()); // generates an Exception (NoSuchElementException)
        // System.out.println(l1.poll()); // gives null as output, as the list is empty
        
        // Creating an ArrayList and adding some elements
        ArrayList<Integer> al = new ArrayList();
        al.add(12);
        al.add(23);
        al.add(90);
        al.add(32);
        al.add(100);

        // Creating a LinkedList from the ArrayList 'al'
        LinkedList<Integer> l2 = new LinkedList<>(al);

        // Using 'element()' to get the first element without removing it.
        // This will return the first element, 12 in this case.
        System.out.println("Element at start: " + l2.element());
        
        // Using 'getFirst()' to get the first element without removing it.
        // This will also return 12.
        System.out.println("Element at start: " + l2.getFirst());

        // Using 'peek()' to get the first element without removing it.
        // This will return 12 but does not throw an exception if the list is empty.
        System.out.println("Element at start: " + l2.peek());
        
        // Using 'peekFirst()' to get the first element without removing it.
        // This will return 12, similar to peek().
        System.out.println("Element at start: " + l2.peekFirst());

        // Using 'poll()' to remove and return the first element.
        // This will remove and return 12, leaving the list [23, 90, 32, 100].
        System.out.println("Element at start: " + l2.poll());

        // Using 'pollFirst()' to remove and return the first element.
        // This will remove and return 23, leaving the list [90, 32, 100].
        System.out.println("Element at start: " + l2.pollFirst());
        
        // Using 'pop()' to remove and return the first element, like stack operation.
        // This will remove and return 90, leaving the list [32, 100].
        System.out.println("Element at start: " + l2.pop());

        // Using 'remove()' to remove and return the first element.
        // This will remove and return 32, leaving the list [100].
        System.out.println("Element at start: " + l2.remove());
    }

}
