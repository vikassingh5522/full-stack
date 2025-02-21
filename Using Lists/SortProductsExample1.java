	// can be written using anonymous implementation

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
   
   public class SortProductsExample1 {
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
           products.sort(new Comparator<Product>(){
               @Override
               public int compare(Product p1, Product p2) {
                   return Double.compare(p1.getPrice(), p2.getPrice());
               }
           });
   
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
   
   