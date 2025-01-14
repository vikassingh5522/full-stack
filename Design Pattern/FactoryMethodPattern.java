





class Product {
    
	private String name;

    // Private constructor
    private Product(String name) {
        this.name = name;
    }

    // Static factory method
    public static Product createProduct(String type) {

        if (type.equalsIgnoreCase("Laptop")) {
            return new Product("Laptop");
        } 
        else if (type.equalsIgnoreCase("Phone")) {
            return new Product("Phone");
        } 
        else {
            return new Product("Unknown Product");
        }
    }

    public void display() {
        System.out.println("Product: " + name);
    }
}

class FactoryMethodPattern
{
    public static void main(String[] args) {
        Product p1 = Product.createProduct("Laptop");
        Product p2 = Product.createProduct("Tablet");

        p1.display();  // Output: Product: Laptop
        p2.display();  // Output: Product: Unknown Product
    }
}














// class EmpoloyeeFactory{


     

//     // grt the empolyee
//     public static Empoloyee getEmpolyee(String emptype)
//     {
//         if ( emptype.trim().equalsIgnoreCase("Android developer"))
//         {
//         return new Androiddeveloper();
//         }
//         else if (emptype.trim().equalsIgnoreCase("Web developer"))
//         {
//             return new Webdeveloper();
//         }
//         else if (emptype.trim().equalsIgnoreCase("IOS developer"))
//         {
//             return new IOSdeveloper();
//         }
//         else
//         {
//             return null;
//         }
        
        
        
//     }
   
// }

// public class FactoryMethodPattern{
//     public static void main(String [] args)
//     {
//         Empoloyee emp = EmpoloyeeFactory.getEmpolyee("Android developer");
//         emp.work();
//         int salary = emp.getSalary();
//         System.out.println("Salary of Android developer is : "+salary);


//         Empoloyee emp1 = EmpoloyeeFactory.getEmpolyee("Web developer");
//         emp1.work();
//         int salary1 = emp1.getSalary();
//         System.out.println("Salary of Web developer is : "+salary1);

//         Empoloyee emp2 = EmpoloyeeFactory.getEmpolyee("IOS developer");
//         emp2.work();
//         int salary2 = emp2.getSalary();
//         System.out.println("Salary of IOS developer is : "+salary2);

        
//     }


    
// }
