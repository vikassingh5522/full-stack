class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    public void printNames() {
        System.out.println("Name in Child: " + name);
        System.out.println("Name in Parent: " + super.name);
    }
}

public class MainSuper {
    public static void main(String[] args) {
        Child child = new Child();
        child.printNames();
    }
}

