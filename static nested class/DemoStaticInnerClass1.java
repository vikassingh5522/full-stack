



class outer
{
    static int var_out;
    private int x;
    static class inner
    {
        static int var_in;
        private int y;
        public void getData()
        {
            y=200;
        }
        public void showData()
        {
            System.out.println("y="+y);
            System.out.println("var_out="+var_out); //Inner method able to access static members of outer class
        }

    }
    public void in()
    {
        x=100;
    }
    public void out()
    {
        // System.out.println("x="+x);
    System.out.println("var_in="+var_in);  //Error: we cant access the static member of inner class from outer method
    }
}
public class DemoStaticInnerClass1 {
    public static void main(String[] args) {
        outer  ob1= new outer();
        ob1.in();
        ob1.out();

        outer.inner ob2 = new outer.inner();
        ob2.getData();
        ob2.showData();

    }
    
}
