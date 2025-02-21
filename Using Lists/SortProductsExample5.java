// // You can use Collections class, having sort() method 
	
// - static <T extends Comparable<? super T>> void	sort(List<T> list)
// Sorts the specified list into ascending order, according to the natural ordering of its elements.

// - static <T> void sort(List<T> list, Comparator<? super T> c)
// Sorts the specified list according to the order induced by the specified comparator.


import java.util.*;

class Product {
private String name;
private double price;
private int id;

public Product(int id, String name, double price) {
  this.id = id;
  this.name = name;
  this.price = price;
}

public String getName() {
  return name;
}

public double getPrice() {
  return price;
}

public int getId() {
  return id;
}

@Override
public String toString() {
  return id+" - "+name + ":Rs." + price;
}
}

public class SortProductsExample5 {
public static void main(String[] args) {
  // Create a list of products
  List<Product> products = new ArrayList<>();

  products.add(new Product(12,"Laptop", 90999.99));
  products.add(new Product(89,"Smartphone", 64599.99));
  products.add(new Product(2,"Headphones", 1249.99));
  products.add(new Product(34,"Tablet", 8399.99));

  // Output the list before sorting
  /// System.out.println("Before sorting: " + products);
  System.out.println("\n -------------- Before price sorting -------------------");
  Iterator<Product> ob1 = products.iterator();
  while(ob1.hasNext())
  {
      System.out.println(ob1.next());
  }

  // Sort the list based on product price
  //products.sort((p1, p2) ->  Double.compare(p1.getPrice(), p2.getPrice()));
  
  Collections.sort(products, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

  // Output the list after sorting
  ///System.out.println("After price sorting: " + products);
  System.out.println("\n -------------- After price sorting -------------------");
  Iterator<Product> ob = products.iterator();
  while(ob.hasNext())
  {
      System.out.println(ob.next());
  }
}
}
