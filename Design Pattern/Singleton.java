
// 1} constructor private
// 2}object create in static method
// 3} object create with the help of method 
// 4} create file to store object is private

// basic example of singleton design pattern

class Test
{
    private static Test Test;
    //construct
     private Test()
    {
        System.out.println("Object created");
    }

    // methord
    public static Test getTest(){ 

        // Test k= new Test();

        // object create this class 
        if(Test == null)
        {
            Test =new Test();
        }
        return Test; 
    }
}


class Singleton
{
    public static void main(String[] args)
    {
        // Test T1 = new Test(); COMING ERROR
       
        Test T1 = Test.getTest();
        System.out.println(T1.hashCode());

        Test T2 = Test.getTest();
        System.out.println(T2.hashCode());

        Test T3 = Test.getTest();
        System.out.println(T3.hashCode());
    }
}
