class Product {
    private String name;
    private double price;
    private String category;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.category = builder.category;
    }

    public static class Builder {
        private String name = "Default Name";
        private double price = 0.0;
        private String category = "Default Category";

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
    }
}

public class MainBuilderPattern1 {
    public static void main(String[] args) {
        Product product1 = new Product.Builder().build();
        Product product2 = new Product.Builder().setName("Laptop").setPrice(999.99).build();

        System.out.println(product1);
        System.out.println(product2);
    }
}