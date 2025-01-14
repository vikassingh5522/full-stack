




class  A {
    public void show()
    {
        System.out.println("\n A show ");
    }
}
    // class B extends A{
    //     public void show()
    //     {
    //         System.out.println("\n B show ");
    //     }
    // }
   

public class MainClassA {
    public static void main(String[] args) {

    // A obj = new A();
    // obj.show();

    //  A obj2 = new B();
    //  obj2.show();   
    
    A obj1 = new A()
    {
        public void show()
        {
            System.out.println("\n in new  show ");
        }
    };
    obj1.show();
}

}

