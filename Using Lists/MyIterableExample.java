// List iterating 

// - Iterator<E> iterator(): This method returns a basic Iterator object that allows you to iterate through the 
// elements of the ArrayList in forward order only. It provides methods like hasNext() to check if there's a 
// next element and next() to retrieve the next element.

// - ListIterator<E> listIterator(): This method returns a more versatile ListIterator object. It allows you to 
// iterate forward and backward through the ArrayList. Similar to iterator(), it has hasNext(), next(), but 
// also offers methods like hasPrevious() to check for a previous element and previous() to retrieve the 
// previous element.

// - ListIterator<E> listIterator(int index): This method provides even more control. It returns a ListIterator 
// that starts iterating from the specified index position in the ArrayList. The initial call to next() will 
// return the element at the provided index, and subsequent calls will iterate forward. An initial call 
// to previous() will return the element at index - 1 (if it exists).

// Using forEach(): 

// - void	forEach(Consumer<? super E> action): Performs the given action for each element of the Iterable until all elements 
//   have been processed or the action throws an exception.

// //  Iterating over userdefined class using iterator: It is just to know how collection classes defined
// iterator inside. 
import java.util.Iterator;

// Define a custom iterable class
class Demo implements Iterable<String> {
  private String[] data;

  public Demo(String[] data) {
    this.data = data;
  }

  // Implement the iterator() method required by Iterable interface
  @Override
  public Iterator<String> iterator() {
    return new Iterator<String>() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < data.length;
      }

      @Override
      public String next() {
        if (!hasNext()) {
          throw new java.util.NoSuchElementException();
        }
        return data[index++];
      }
    };
  }
}

public class MyIterableExample {
  public static void main(String[] args) {
    // Create an instance of the iterable class
    Demo demo = new Demo(new String[] { "Hello", "World", "Iterable" });

    // Iterate over the elements using a for-each loop
    for (String item : demo) {
      System.out.println(item);
    }

    System.out.println("Using iterator: ");
    Iterator<String> ob=demo.iterator();
    while (ob.hasNext()) {
      System.out.println(ob.next());
      
    }
    
  }
}

// List Iteration Methods in Java (Short Summary)
// Iterator<E> iterator()

// Forward iteration only
// Methods: hasNext(), next()
// Example:
// java
// Copy
// Edit
// Iterator<String> it = list.iterator();
// while (it.hasNext()) {
// System.out.println(it.next());
// }
// ListIterator<E> listIterator()

// Bidirectional iteration (forward & backward)
// Methods: hasNext(), next(), hasPrevious(), previous()
// Example:
// java
// Copy
// Edit
// ListIterator<String> lit = list.listIterator();
// while (lit.hasNext()) {
// System.out.println(lit.next());
// }
// ListIterator<E> listIterator(int index)

// Starts iteration from a specified index
// First next() → element at index, first previous() → element at index - 1
// Example:
// java
// Copy
// Edit
// ListIterator<String> lit = list.listIterator(2); // Starts from index 2
// forEach(Consumer<? super E> action)

// Uses lambda expressions for concise iteration
// Example:
// java
// Copy
// Edit
// list.forEach(item -> System.out.println(item));
// Let me know if you need more details! 🚀

// You said:
// list.forEach(item -> System.out.println(item)); eaplain mehtort
// ChatGPT said:
// Understanding forEach(item -> System.out.println(item)); in Java
// This statement uses the forEach method to iterate over a list and print each
// element. Let's break it down step by step.

// 1️⃣ What is forEach?
// Method Signature:
// java
// Copy
// Edit
// void forEach(Consumer<? super E> action)
// It iterates over each element of a List, Set, Map, or any Iterable
// collection.
// It takes a lambda expression or a method reference as an argument to define
// what to do with each element.