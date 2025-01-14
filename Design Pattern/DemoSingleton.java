

class Singleton{
    private static Singleton instance;

    private static String msg;

    private Singleton()
    {
        System.out.println("Singleton class created");

    }

    public static Singleton getInstance(String str)
    {
         if(instance == null)
         {
            instance =new Singleton();
         }
         return instance;
    }

    public void displayMessage()
    {
        System.out.println("Hello from Singleton class");
    }
}

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance("one");
        obj1.displayMessage();

        Singleton obj2 = Singleton.getInstance("two");
        obj2.displayMessage();

        Singleton obj3 = Singleton.getInstance("three");
        obj3.displayMessage();
    }
}