
import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIfArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(20);
        numbers.add(33);
        numbers.add(40);
        numbers.add(50);
        numbers.add(61);
        numbers.add(70);
        numbers.add(15);
		System.out.println("Numbers: " + numbers);

        // Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Remove all even numbers using removeIf and Predicate
        numbers.removeIf(isEven);
        System.out.println("Numbers after removing even numbers: " + numbers);

        // Another Predicate to check if a number is greater than 30
        Predicate<Integer> greaterThan30 = number -> number > 30;
		numbers.removeIf(greaterThan30);		
        System.out.println("Numbers after removing >30 numbers: " + numbers);
    }
}
