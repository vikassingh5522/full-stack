
// 2. Final Methods: A method declared as final cannot be overridden by subclasses. This is useful 
// when you want to prevent a specific behavior from being modified in child classes.


class Base {
	final public void message() {
		System.out.println("In the Base Class");
	}
}

class Child extends Base {
        @Override
    public void message() { // error: message() in Child cannot override message() in Base overridden method is final
		System.out.println("In the Child Class");
	}
}
class FinalMethodExample
{
	public static void main(String[] args) 
	{
		Child ob = new Child();
		ob.message();
	}
}