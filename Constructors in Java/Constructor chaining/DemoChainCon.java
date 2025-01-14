public class DemoChainCon {
    private String name;
    private int age;
    private String grade;

    // Default constructor
    public DemoChainCon() {
        this("Unknown", 0, "Not Assigned");  // Calls the parameterized constructor
		System.out.println("\n Default constructor of DemoChainCon class");
    }

    // Constructor with two parameters
    public DemoChainCon(String name, int age) {
        this(name, age, "Not Assigned");  // Calls the constructor with three parameters
		System.out.println("\n Para(args-2) constructor of DemoChainCon class");
    }

    // Parameterized constructor with three parameters
    public DemoChainCon(String name, int age, String grade) {
		System.out.println("\n Para(args-3) constructor of DemoChainCon class");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        DemoChainCon s1 = new DemoChainCon();  // Calls default constructor
        DemoChainCon s2 = new DemoChainCon("Amol", 20);  // Calls two-parameter constructor
        DemoChainCon s3 = new DemoChainCon("Baba", 22, "A");  // Calls three-parameter constructor

        s1.display();  // Output: Name: Unknown, Age: 0, Grade: Not Assigned
        s2.display();  // Output: Name: Alice, Age: 20, Grade: Not Assigned
        s3.display();  // Output: Name: Bob, Age: 22, Grade: A
    }
}