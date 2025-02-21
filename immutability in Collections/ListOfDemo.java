// 2. Using Java 9+ List.of() Factory Method:

// 	Java 9 introduced a factory method List.of() that can be used to create immutable lists. 
// 	This method is convenient for creating small, fixed-size lists.
// 		e.g.
// 			List<String> colors = List.of("Red", "Green", "Blue");

// package collectionexamples;
import java.util.LinkedList;
import java.util.List;

public class ListOfDemo {

    public static void main(String[] args) {
        // LinkedList cannot be used directly with List.of()
        // System.out.println(List.of(new LinkedList<>())); // Compilation error

        // Option 1: Convert LinkedList to an array and use List.of()
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        String[] fruitsArray = fruits.toArray(new String[fruits.size()]);
        List<String> immutableList = List.of(fruitsArray);

        System.out.println("Original List (LinkedList): ");
        printList(fruits);

        System.out.println("\nImmutable List (using List.of() with array): ");
        printList(immutableList);

        // Trying to modify the immutable list throws an exception
        try {
            immutableList.add("Mango");
            System.out.println("Successfully added Mango (should not happen!)");
        } catch (UnsupportedOperationException e) {
            System.out.println("Adding element to unmodifiable list: " + e);
        }

        // Modifications to the original list (LinkedList) are not reflected
        fruits.addFirst("Grape");
        System.out.println("\nAfter modifying original list (LinkedList): ");
        printList(fruits);

        System.out.println("\nImmutable List (after modification - not reflected): ");
        printList(immutableList);
    }

    private static void printList(List<String> list) {
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}

