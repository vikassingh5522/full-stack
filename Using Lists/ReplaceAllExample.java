import java.util.*;

public class ReplaceAllExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Replacing all elements with 0 using a traditional for loop
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, 0);
        }
 

        // or  
        
           // Replacing all elements with 0
           numbers.replaceAll(n -> 0);

        System.out.println("After replaceAll: " + numbers);
    }
}
