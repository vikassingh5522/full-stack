
class sample {
    public void sayHi() {
        System.out.println("\n hii for sample");
    }

    public void sayHello() {
        System.out.println("\n hello for sample");
    }
}

class test extends sample {
    public void sayHello() {
        System.out.println("\n hello fro test");
    }
}

public class MainClassAIC {
    public static void main(String[] args) {
        sample ob1 = new sample();
        ob1.sayHi();
        ob1.sayHello();

        System.out.println("================================");

        test ob2 = new test();
        ob2.sayHi();
        ob2.sayHello();

        System.out.println("\n================================");


        sample ob3 = new sample() {
			int z=100;
			public void sayHello() {
				System.out.println("Hello From No-Name");
			}
		};
		ob3.sayHi();
		ob3.sayHello();
    }

}