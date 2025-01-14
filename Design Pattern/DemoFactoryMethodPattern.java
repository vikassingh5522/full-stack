class Product {

    private String name;

    // Private constructor
    private Product(String name) {
        this.name = name;
    }

    public static  Product getProductName(String type) {
        if (type.equalsIgnoreCase("laptop")) 
        {
            return new Product("laptop");
        } else if (type.equalsIgnoreCase("mobile"))
         {
            return new Product("mobile");
        } else if (type.equalsIgnoreCase("tablet")) {
            return new Product("tablet");
        } 
        else if (type.equalsIgnoreCase("desktop")) {
            return new Product("desktop");
        }
        else {
            return new Product("unknown product");
        }
    }

    public void display() {
        System.out.println("Product name: " + name);
    }
}

class DemoFactoryMethodPattern {
    public static void main(String[] args) {
        Product p1 = Product.getProductName("laptop");
        p1.display();

        Product p2 = Product.getProductName("mobile");
        p2.display();

        Product p3 = Product.getProductName("Tablet");
        p3.display();

        Product p4 = Product.getProductName("desktop");
        p4.display();
    }
}

















