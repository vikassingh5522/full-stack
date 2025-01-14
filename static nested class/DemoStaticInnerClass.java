

class outer 
{
    private int x;
    static class Inner
    {
        private int y;
        public void setdata()
        {
           y=200;
        }
        public void showdata()
        {
             System.out.println("y="+y);
        }
    }
    public void in()
    {
        x=100;
    }
    public void out()
    {
        System.out.println("x="+x);
    }
}

public class DemoStaticInnerClass {
    
    public static void main(String[] args)
    {
        outer ob1= new outer();
        ob1.in();
        ob1.out();

        outer.Inner ob2 = new outer.Inner();
        ob2.setdata();
        ob2.showdata();
    }
}
