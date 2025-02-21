import java.util.*;

public class RetainAllExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

        // Retain only elements present in list2
        boolean modified = list1.retainAll(list2);

        System.out.println("Updated list1: " + list1); // Output: [3, 4, 5]
        System.out.println("Was list modified? " + modified); // Output: true
    }
}
