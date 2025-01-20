
	//🫡✔️ Overloading and Overriding in the single inheritance.

	// - Overloading:
	//   Overloading occurs when two or more methods in the same class (or in a child class) have the same 
	//   name but different parameter lists (number, type, or order of parameters). It is an example of 
	//   compile-time polymorphism.

	// - Key Points of Overloading:
	// 	- Happens within the same class.
	// 	- Methods must have the same name but different parameter lists.
	// 	- Return type may or may not be different.
	// 	- Resolved at compile time.


class  Calculate
{
    //method 1 
    public  int add(int a, int b)
    {
        return a + b;
    }
    public int add(int a, int b,int c)
    {
        return a + b + c;
    }
}
public class MainOverloading {

    public static void main(String[] args) {
        Calculate ob1 = new Calculate();
        System.out.println(ob1.add(2,10));
        System.out.println(ob1.add(2,10,20));

    }
}