import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        ListIterator<String> listIt = list.listIterator();

        System.out.println("Forward Traversal using ListIterator:");
        while (listIt.hasNext()) {  // Checks if a next element exists
            System.out.println(listIt.next());  // Moves forward
        }
       
        System.out.println("\nBackward Traversal using ListIterator:");
        while (listIt.hasPrevious()) {  // Checks if a previous element exists
            System.out.println(listIt.previous());  // Moves backward
        }
    }
}
