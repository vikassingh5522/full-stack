// package collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class UsingsplIterator {

	public static void main(String []args) {
		
		ArrayList<Integer> arlst=new ArrayList<Integer>();
		arlst.add(12);
		arlst.add(32);
		arlst.add(142);
		arlst.add(127);
		arlst.add(42);
		arlst.add(16);
		arlst.add(112);
		System.out.println("Entered Arraylist is: "+arlst);
		
		Iterator<Integer> ob=arlst.iterator();
		System.out.println("Entered Arraylist(using iterator) is: ");
		while(ob.hasNext())
		{
		  System.out.print("  "+ob.next());
		}
		
		ob=arlst.iterator();
		System.out.println("\n Entered Arraylist(using foreach) is: ");
		ob.forEachRemaining(element -> System.out.print(" "+element));
		
		//----------------
		
		Spliterator<Integer> sob = arlst.spliterator();
		System.out.println("\n using spiterator tryadvance()-I: ");
		while(sob.tryAdvance(element -> System.out.print(" "+element)));
		
		sob = arlst.spliterator();
		System.out.println("\n using spiterator tryadvance()-II: ");
		while(sob.tryAdvance(System.out::println)); // shorter way of above
		
		//---------------
		
		sob = arlst.spliterator();
		Spliterator<Integer> sob1 = sob.trySplit(); // a part of sob is separated 
		System.out.println("\n Entered Arraylist(split part) is: ");
		if(sob1!=null)
			sob1.forEachRemaining(element -> System.out.print(" "+element)); // separated part display
		
		System.out.println("\n Entered Arraylist(split part) is: ");
		sob.forEachRemaining(element -> System.out.print(" "+element)); // remaining part display
		
	}

}
