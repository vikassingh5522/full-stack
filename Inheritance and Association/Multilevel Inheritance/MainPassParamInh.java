	/// Using the constructors in inheritance

    class Base
    {
        private int a;
        
        public Base()
        {
            System.out.println("\n In Base default");
            a=10;
        }
        public Base(int x)
        {
            System.out.println("\n In Base para");
            a=x;
        }
        public void showBase()
        {
            System.out.println("\n a="+a);
        }
    }
    class ImdBase extends Base
    {
        private int b;
        public ImdBase()
        {
            System.out.println("\n In ImdBase default");
            b=20;
        }
        public ImdBase(int x, int y)
        {
            super(x);
            System.out.println("\n In ImdBase para");
            b=y;
        }
        public void showImdBase()
        {
            showBase();
            System.out.println("\n b="+b);
        }
    }
    class Derived extends ImdBase 
    {
        private int c;
        public Derived()
        {
            System.out.println("\n In Derived default");
            c=30;
        }
        public Derived(int x, int y, int z)
        {
            super(x,y);
            System.out.println("\n In Derived para");
            c=z;
        }
        public void showDerived()
        {
            showImdBase();
            System.out.println("\n c="+c);
        }
    }
    
    class MainPassParamInh
    {
        public static void main(String []args)
        {
            Derived ob1=new Derived();
            ob1.showDerived();
    
            Derived ob2=new Derived(100,200,300);
            ob2.showDerived();
        }
    }