
// - void replaceAll(UnaryOperator<E> operator): Replaces each element of this list with the result of applying
// the operator to that element.

import java.util.*;
public class ArrayListExampleReplaceAll {
public static void main(String[] args) {

  // Creating an ArrayList of Integers
  List<Integer> numbers = new ArrayList<>();
  
  // Adding elements to the ArrayList
  numbers.add(1);
  numbers.add(2);
  numbers.add(3);
  numbers.add(4);
  numbers.add(5);
  
  // Printing the original ArrayList
  System.out.println("Original ArrayList: " + numbers);
  
  // Replacing each element with its square
  numbers.replaceAll(n -> n * n);
  
  // Printing the modified ArrayList
  System.out.println("Modified ArrayList: " + numbers);
}
}