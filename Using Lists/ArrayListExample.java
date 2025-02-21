



	// // Search and remove operations

	// - boolean contains(Object o): Returns true if this list contains the specified element.

	// - E get(int index): Returns the element at the specified position in this list.

	// - int indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 
	// 	if this list does not contain the element.

	// - boolean isEmpty(): Returns true if this list contains no elements.

	// - int lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in this list, 
	//   or -1 if this list does not contain the element.

	// - E remove(int index): Removes the element at the specified position in this list.
	
	// - boolean remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.

	// - boolean removeAll(Collection<?> c): Removes from this list all of its elements that are contained in the 
	//   specified collection.

	// - List<E> subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified 
	//   fromIndex, inclusive, and toIndex, exclusive.

import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> arraylist=new ArrayList<>(9); 
		arraylist.add("C++");
		arraylist.add("Python");
		arraylist.add("Java");
		arraylist.add(0,"C");
		System.out.println("Arraylist contains Java: "+arraylist.contains("Java")); 

		ArrayList<String> al=new ArrayList<>(); 
		al.add("Android");
		al.addAll(arraylist);
		System.out.println(al); 
		System.out.println("2nd element in al: "+al.get(2)); 
		
		ArrayList<String> a2=new ArrayList<>(); 
		a2.add("SQL");
		a2.add("NoSQL");
		a2.addAll(1,al);
		System.out.println("a2 contains arraylist: "+a2.containsAll(arraylist)); 		
		a2.set(5, "Oracle");
		System.out.println(a2);
		
		List<String> sl=a2.subList(2, 5);
		System.out.println("Sublist: "+sl);
		
		if(a2.indexOf("Java")!=-1)
		{
			System.out.println("Java present at "+a2.indexOf("Java")+" position");
		}
		else
		{
			System.out.println("Java is not present in the List");
		}
		
		a2.add("C");
		a2.add("Java");
		System.out.println(a2);
		System.out.println("Last index of C in a2: "+a2.lastIndexOf("Java"));
		
        
		a2.remove("C"); // removes first ocr
		System.out.println(a2);
		
		a2.add("Java");
		a2.removeAll(arraylist); // remove all ocr of elm in arraylist from a2
		System.out.println(a2);
	}
}