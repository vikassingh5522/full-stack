


class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void printNames() {
        System.out.println("Name in Child: " + name);
        System.out.println("Name in Parent: " + super.name);  // Access parent field
    }
}

public class ClassFields{
    public static void main(String[] args) {
        Child child = new Child();
        child.printNames();
    }
}
