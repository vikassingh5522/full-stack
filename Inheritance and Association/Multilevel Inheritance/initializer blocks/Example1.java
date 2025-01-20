
	// instace of multile init. blocks sequence in maintained while execution

    class Example1 {
        int x;
    
        {
            // Instance initializer block
            x = 20;
            System.out.println("Instance initializer block executed-2");
        }
    
        {
            // Instance initializer block
            x = 10;
            System.out.println("Instance initializer block executed-1");
        }
        Example1() {
            System.out.println("Constructor executed");
        }
    
        public static void main(String[] args) {
            Example1 obj = new Example1();
            // Output:
            // Instance initializer block executed
            // Constructor executed
        }
    }
    