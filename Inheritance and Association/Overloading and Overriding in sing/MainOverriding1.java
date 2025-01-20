// Accessing the Overriden methods 

// In Java, when a method is overridden, the subclass version is called by default. However, if you want to 
// access the overridden method from the parent class in the subclass, you can use the 🕵️🫡super keyword. 
// This is useful when you want to extend the behavior of the parent class's method rather than 
// completely replacing

class Animal {
    void sound() {
        System.out.println("\n some generic animal sound");
    }
}
class dog extends Animal {
    void sound() {
        super.sound();
        System.out.println("\n The  dog Barks ");
        }
}
public class MainOverriding1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // prints: some generic animal sound
         dog b = new dog();
         b.sound(); // prints: some generic animal sound, The dog Barks
    }   
}