
// 🫡👍- Overriding:

// Overriding occurs when a child class provides its own implementation of a method that is already 
// defined in the parent class. It is an example of runtime polymorphism.

// - Key Points of Overriding:
//    - Happens between parent and child classes.
//    - Method signature (name, parameters, and return type) must be exactly the same.
//    - Resolved at runtime (dynamic method dispatch).
//    - The access modifier of the overriding method must be the same or more permissive 
//      than the method in the parent class.




class Animal
{
    public void sound()
    {
        System.out.println("\n Some generic animal sound ");
    }
}
class Dog extends Animal
{
    public void sound()
    {
        System.out.println("\n The dog barks ");
    }
}
public class MainOverriding {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // calls the parent class method

        Dog dog =new Dog();
        dog.sound();   // overriden the parent  class method in to the child method
    }
}