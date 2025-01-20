	// Passing mutable object

    class Num
    {
        private int x;
        public void setX( int x) {
            this.x = x;
        }
        public int getX() {
            return x;
        }
    }
    class DemoRefPassMutable
    {
        public static void fun(final Num ob3, final Num ob4)  // absence of final will gives same output
        {
            ob3.setX(1000);
            ob4.setX(2000);
        }
        public static void main(String[] args) 
        {
            Num ob1 = new Num();
            Num ob2 = new Num();
            ob1.setX(10);
            ob2.setX(20);
            System.out.println("Before Call: ob1 - "+ob1.getX()+"\t ob2 - "+ob2.getX());
            fun(ob1,ob2);
            System.out.println("Before Call: ob1 - "+ob1.getX()+"\t ob2 - "+ob2.getX());
        }
    }
    
    