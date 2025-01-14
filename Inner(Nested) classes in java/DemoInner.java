
class outer {
    private int x = 100;
    private static int y = 200;
    void show()
	{
		System.out.println("Inside Outer Class");
	}
   
    class inner {
        void display()
         {
             show();
            System.out.println(" inside non-static Inner class");
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        }
    }
}

class DemoInner {
    public static void main(String[] args) {
        outer ob1 = new outer();
        ob1.show();

        outer.inner ob2 =ob1.new inner();
        ob2.display();


        // another way
        
        // outer ob2 = new outer();//+
        // outer.inner ob1 = ob2.new  inner();//+
        // ob1.display();
        
    }

}