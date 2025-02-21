import java.util.*;

public class CustomListIteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        ListIterator<Integer> listIt = numbers.listIterator(numbers.size()); // Start at the end

        System.out.println("Backward Traversal:");
        while (listIt.hasPrevious()) {  // Moving backwards
            System.out.println(listIt.previous());
        }

        System.out.println("\nForward Traversal Again:");
        while (listIt.hasNext()) {  // Moving forwards
            System.out.println(listIt.next());
        }
    }
}
