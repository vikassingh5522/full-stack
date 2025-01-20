

// Note: 
// - Once you initilize, Value of final variable can not be altered, Even using constructor, 
// when it is assigned already.
// - Constructor allows to initilize, only when it is not assined in decleration.


class Demo
{
	private int x;
	public Demo() {
		x=10;
	}
	public Demo(int t) {
		x=t;
	}
	public void setx() {
		x=1000;
	}
	public void show() {
		System.out.println("x="+x);
	}
}
class FinalVariableExample1 
{
	public static void main(String[] args) 
	{
		final Demo ob1 = new Demo(100);
		Demo ob2 = new Demo(200);
		ob1.show();
		ob2.show();

		// ob1=ob2;	// error: cannot assign a value to final variable ob1
		// the reference cannot be changed coz ob1 is final

		ob1.setx(); // evenif ob1 is final as we are not chamging the reference, it will allow
			    // to change the values of fields.
		ob1.show();
	}
}
