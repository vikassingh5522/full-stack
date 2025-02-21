// package all program.Java program.Collection Framework.Using Lists;

import java.util.*;

public class DemoArrayList {
    public static void main(String[] args) {
        
        Collection c = new ArrayList<>();
        c.add(11); //
        c.add("hei"); //
        c.add(14.25);
        System.out.println("collection is c "+c);

        ArrayList l = new ArrayList(c);
        l.add(true);
        System.out.println("list is l"+l);

        ArrayList l2 = new ArrayList(20);
        l2.add(56.86);
        l2.addAll(l);
        System.out.println("arraylist is l2"+l2);


    }
}


// Resizable-array implementation of the List interface. Implements all optional list operations, and permits 
// 	all elements,including null. In addition to implementing the List interface, this class provides methods to 
// 	manipulate the size of the array that is used internally to store the list. 
// 	(This class is roughly equivalent to Vector, except that it is unsynchronized.)

// 	Constructor and Description
// 	----------------------------

// 	- ArrayList(): Constructs an empty list with an initial capacity of ten.
	
// 	- ArrayList(Collection<? extends E> c): Constructs a list containing the elements of the specified collection, 
// 	  in the order they are returned by the collection's iterator.

// 	- ArrayList(int initialCapacity): Constructs an empty list with the specified initial capacity.


// 	// Allow store any type of object (not type-safe).