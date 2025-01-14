

class DemoMainSameClass1
{
    private int x=1;
    private double y=2.2;
    public static void main(String[] args)
    {
        System.out.println("\n mani() started ");

        DemoMainSameClass1 ob1   = new DemoMainSameClass1();
        System.out.println("\n x="+ob1.x);
        System.out.println("\n y="+ob1.y);

        ob1.display();

        System.out.println("\n mian() end ");

    }

    public void display()
    {
        System.out.println("\n x="+x);
        System.out.println("\n y="+y);
    }
}