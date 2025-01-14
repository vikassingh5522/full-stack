
// package all program.Java program.OOP java.Inner(Nested) classes in java;

class outer {

    private static int x = 100;

    static class inner {
        void display() {

            System.out.println("non-static inner class");
            System.out.println("x=" + x);
            // System.out.println("y=" + y); // not accessible from the outer side
        }
    }
}

public class Nestedclass {

    public static void main(String[] args) {

        outer.inner obj = new outer.inner();
        obj.display();
    }
}