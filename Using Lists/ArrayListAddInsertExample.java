import java.util.ArrayList;
public class ArrayListAddInsertExample {

	public static void main(String[] args) {

		ArrayList<String> arraylist=new ArrayList<>(9); 
		arraylist.add("C++");
		arraylist.add("Java");
		arraylist.add(0,"C");
		System.out.println(arraylist); 

		ArrayList<String> al=new ArrayList<>(); 
		al.add("Android");
		al.add("iOS");
		al.addAll(arraylist);
		System.out.println(al); 
		
		ArrayList<String> a2=new ArrayList<>(); 
		a2.add("SQL");
		a2.add("NoSQL");
		a2.addAll(1,al);
		System.out.println(a2); 
		
		String str = a2.set(2, "Oracle");
		System.out.println("After removing "+str+" Arrays List is: "+a2);
	}
}

// // Adding/inserting the elements in ArrayList

	// - boolean add(E e): Appends the specified element to the end of this list.

	// - void add(int index, E element): Inserts the specified element at the specified position in this list.

	// - boolean addAll(Collection<? extends E> c): Appends all of the elements in the specified collection to 
	//   the end of this list, in the order that they are returned by the specified collection's Iterator.

	// - boolean addAll(int index, Collection<? extends E> c): Inserts all of the elements in the specified collection 
	//   into this list, starting at the specified position.

	// - E set(int index, E element): Replaces the element at the specified position in this list with the 
	//   specified element.














