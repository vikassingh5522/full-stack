import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UnmodifiableListDemo {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original List (LinkedList): ");
        printList(fruits);

        // Create an unmodifiable view using Collections.unmodifiableList()
        List<String> unmodifiableList = Collections.unmodifiableList(fruits);

        System.out.println("\nUnmodifiable List: ");
        printList(unmodifiableList);

        // Trying to modify the unmodifiable list throws an exception
        try {
            unmodifiableList.add("Mango");
            System.out.println("Successfully added Mango (should not happen!)");
        } catch (UnsupportedOperationException e) {
            System.out.println("Adding element to unmodifiable list: " + e);
        }

        // Modifications to the original list are still reflected
        fruits.addFirst("Grape");
        System.out.println("\nAfter modifying original list (LinkedList): ");
        printList(fruits);

        System.out.println("\nUnmodifiable List (after modification): ");
        printList(unmodifiableList);
    }

    private static void printList(List<String> list) {
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}
