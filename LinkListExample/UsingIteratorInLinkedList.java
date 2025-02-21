
	// Iterating in LinkedList using iterator(), listIterator() and spliterator()


    import java.util.LinkedList;
    import java.util.ListIterator;
    import java.util.Spliterator;
    import java.util.function.Consumer;
    
    public class UsingIteratorInLinkedList {
        public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("Apple");
            linkedList.add("Banana");
            linkedList.add("Cherry");
            linkedList.add("Date");
            linkedList.add("Elderberry");
    
            // Using iterator() to print all elements
            System.out.println("Using iterator:");
            var iterator = linkedList.iterator();
            // The var keyword in Java is a feature introduced in Java 10 as part of the local 
            // variable type inference. It allows the compiler to infer the type of a local variable 
            // based on the type of the initializer. 
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
    
            // Using listIterator() to traverse forward and backward, modifying elements
            System.out.println("\nUsing listIterator (forward and backward):");
            ListIterator<String> listIterator = linkedList.listIterator();
            System.out.println("Traversing forward and modifying:");
            while (listIterator.hasNext()) {
                String fruit = listIterator.next();
                if (fruit.equals("Banana")) {
                    listIterator.set("Blueberry");
                }
                System.out.println(fruit);
            }
    
            System.out.println("Traversing backward:");
            while (listIterator.hasPrevious()) {
                System.out.println(listIterator.previous());
            }
    
            // Using spliterator() to split and process the list
            System.out.println("\n Using spliterator:");
            Spliterator<String> spliterator1 = linkedList.spliterator();
            Spliterator<String> spliterator2 = spliterator1.trySplit();
    
            // Consumer to process elements
            Consumer<String> consumer = fruit -> System.out.println("Processing: " + fruit);
    
            // Process first half of the list
            System.out.println("First spliterator:");
            spliterator1.forEachRemaining(consumer);
    
            // Process second half of the list
            System.out.println("Second spliterator:");
            if (spliterator2 != null) {
                spliterator2.forEachRemaining(consumer);
            } else {
                System.out.println("Spliterator could not split further.");
            }
        }
    }
    