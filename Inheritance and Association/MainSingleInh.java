// - Single inheritance: 
// 	  Single inheritance in Java is a concept where a class inherits from one and only one parent (or superclass). 
// 	  It allows a child class to acquire the properties and methods of a single parent class, promoting code
// 	  reusability and a hierarchical relationship.

// parent class
class animal{
    public void eat()
    {
        System.out.println("animal it eat food...");
    }
}
//child
class bog extends animal{
    public void bark()
    {
      System.out.println("\n dog is barks...");
    }
}
//child
class Humans extends animal
{
   public void speak()
    {
        System.out.println("\n humans is speak");
    }
}

public class MainSingleInh {
  public static void main(String[] args)
  {
     bog ob1 =new bog();
     ob1.eat();
     ob1.bark();

     //ob1.speak(); // error: cannot find symbol

     
     Humans ob2 = new Humans();
      ob2.eat();
     ob2.speak();
  }
    
}
