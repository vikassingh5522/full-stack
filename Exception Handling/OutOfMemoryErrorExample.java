import java.util.ArrayList;
public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (true) {
                list.add(1); // Continually adding elements
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Error: Out of memory!");
        }
    }
}


	// OutOfMemoryError: When the Java Virtual Machine (JVM) runs out of memory.
	
	// An OutOfMemoryError in Java occurs when the Java Virtual Machine (JVM) cannot allocate more 
	// memory for an object because it has run out of available memory. This error is part of the 
	// java.lang package and typically indicates that your application needs more memory than what 
	// is allocated or that there are memory management issues like memory leaks.

	// Here are the common scenarios when OutOfMemoryError might occur:

	//  - Heap Space Exhaustion( java.lang.OutOfMemoryError: Java heap space )
	//  - PermGen Space Exhaustion (Pre-Java 8 - java.lang.OutOfMemoryError: PermGen space)
	//  - Metaspace Exhaustion (Java 8 and later - java.lang.OutOfMemoryError: Metaspace) 
	//  - Direct Buffer Memory Exhaustion (java.lang.OutOfMemoryError: Direct buffer memory)
	//  - GC Overhead Limit Exceeded (java.lang.OutOfMemoryError: GC overhead limit exceeded)
	//  - Unable to Create Native Thread (java.lang.OutOfMemoryError: Unable to create new native thread)

