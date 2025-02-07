
// - Static synchronization (class level synchronization)
// ------------------------------------------------------

// Static synchronization in Java involves synchronizing access to a shared resource using a static keyword. When 
// a method is declared as static synchronized, only one thread can execute that method at a time for the entire 
// class, not just for the object instance.

//             ob1				    ob2	
//     t1 -------> [ print() ]		t11 -------> [ print()  ]
//               ^				       ^
//               |				       |
//              t2                               t22

// In the example below, there are two different objects of type ShowArray, and each will be accessed using a pair
// of threads in synchronized manner. But as the synchronization is at instance(object) level, a single thread from
// each pair will execute at a time.


//             ob1				    ob2	
//     t1 -------> [      ] ====== print()====== [   ] <------- t11
//               ^	    (common to all objects)    ^
//               |				       |
//              t2                     t22

class Resource
{
private static String []data = {"hello", "Good day", "to", "all", "of you","wish", "you ", "all the", "best"};

synchronized static public void show() {
    System.out.println("The Data is: ");
    for( int i=0 ; i<data.length ; i++ ) {
        try{ Thread.sleep(600); } catch(Exception e){}
        System.out.println(Thread.currentThread().getName()+" - "+data[i]);
    }
}
}
class StaticSyncMethod
{
public static void main(String[] args) 
{
    System.out.println("Main started");

    Resource rob1 = new Resource();
    Resource rob2 = new Resource();

    // Thread 1
    Thread t1 = new Thread(){
        public void run() {
            rob1.show();
        }
    };
    t1.setName("One");
    t1.start();

    // Thread 2
    Thread t2 = new Thread(){
        public void run() {
            rob1.show();
        }
    };
    t2.setName("Two");
    t2.start();

    //-----------------------------------

    // Thread 3
    Thread t3 = new Thread(){
        public void run() {
            rob2.show();
        }
    };
    t3.setName("Three");
    t3.start();

    // Thread 4
    Thread t4 = new Thread(){
        public void run() {
            rob2.show();
        }
    };
    t4.setName("Four");
    t4.start();

    System.out.println("Main ended");
}
}
