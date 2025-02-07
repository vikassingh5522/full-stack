	// Lets write another program

    class Resource
    {
        public void sayHi(){
            System.out.println("Hi...!!");
        }
        public void sayHello(){
            System.out.println("Hello...!!");
        }
    }
    
    class MainExampleResource
    {
        public static void main(String []args)
        {
            Resource rob = new Resource();
    
            Thread t1 = new Thread(){
                public void run(){
                    for(int i=0 ; i<7 ; i++){
                        rob.sayHi();
                        try{Thread.sleep(500);}catch(Exception e){}
                    }
                }
            };
    
            Thread t2 = new Thread(){
                public void run(){
                    for(int i=0 ; i<7 ; i++){
                        rob.sayHello();
                        try{Thread.sleep(500);}catch(Exception e){}
                    }
                }
            };
        }
    }
    
    