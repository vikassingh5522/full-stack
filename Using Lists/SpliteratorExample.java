import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Go");

        // Getting a Spliterator
        Spliterator<String> spliterator = list.spliterator();

        // Using tryAdvance() - Processes elements one by one
        System.out.println("Using tryAdvance():");
        spliterator.tryAdvance(System.out::println);

        // Using forEachRemaining() - Processes all remaining elements
        System.out.println("\n Using forEachRemaining():");
        spliterator.forEachRemaining(System.out::println);

        // Getting a new Spliterator to demonstrate trySplit()
        Spliterator<String> split1 = list.spliterator();
        Spliterator<String> split2 = split1.trySplit(); // Splitting for parallel processing

        System.out.println("\nProcessing first half:");
        if (split2 != null) {
            split2.forEachRemaining(System.out::println);
        }

        System.out.println("\nProcessing second half:");
        split1.forEachRemaining(System.out::println);
    }
}
