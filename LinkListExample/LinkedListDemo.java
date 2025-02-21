// use forEach() and toArray()

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // 1. Print elements using forEach()
        System.out.println("Printing fruits using forEach():");
        fruits.forEach(fruit -> System.out.println(fruit));

        // 2. Modify elements using forEach()
        System.out.println("\nModifying fruits (uppercase) using forEach():");
        fruits.forEach(fruit -> fruits.set(fruits.indexOf(fruit), fruit.toUpperCase()));
        fruits.forEach(fruit -> System.out.println(fruit));

        // 3. Convert LinkedList to Object array using toArray()
        System.out.println("\nConverting fruits to Object array using toArray():");
        Object[] fruitsArray = fruits.toArray();
        for (Object fruit : fruitsArray) {
            System.out.println(fruit);
        }

        // 4. Convert LinkedList to String array using toArray(String[])
        System.out.println("\nConverting fruits to String array using toArray(String[]):");
        String[] fruitsStringArray = fruits.toArray(new String[fruits.size()]);
        for (String fruit : fruitsStringArray) {
            System.out.println(fruit);
        }
    }
}

