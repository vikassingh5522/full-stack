class Outer 
{
	void outerMethod() 
	{
        	class MethodInner 
		{
            		void display() 
			{
                		System.out.println("Inside Method-Local Inner Class");
            		}
        	}
			MethodInner inner = new MethodInner();
        	inner.display();
        	
    	}
	// void anotherMethod()
	// {
	// 	MethodInner ob = new MethodInner(); // will generate error, coz member decl. 
	// }					    // in a scope can be accessible with in only.
}

public class MethodInner {

	public static void main(String[] args) {
		// Outer ob = new Outer();
		// ob.outerMethod();
	}	
}