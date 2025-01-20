// 3. Final Classes: A class declared as final cannot be extended. This is useful for creating immutable 
// classes or when you want to prevent inheritance.

final class FinalClass {
void display() {
System.out.println("This is a final class.");
}
}

// class SubClass extends FinalClass { 
//     // Error: Cannot inherit from final class
// }

public class FinalClassExample {
public static void main(String[] args) {
FinalClass obj = new FinalClass();
obj.display();
}
}
