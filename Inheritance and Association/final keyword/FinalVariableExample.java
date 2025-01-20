public class FinalVariableExample {
    final int CONSTANT = 100;  // Initialized during declaration
    final int anotherConstant;

FinalVariableExample() {
        anotherConstant = 100;  // Initialized in the constructor
}

public static void main(String[] args) {

FinalVariableExample example = new FinalVariableExample();
System.out.println(example.CONSTANT);
System.out.println(example.anotherConstant);

// example.CONSTANT = 300; // Error: Cannot assign a value to a final variable
// example.anotherConstant = 400; // Error: Cannot assign a value to a final variable
}
}
