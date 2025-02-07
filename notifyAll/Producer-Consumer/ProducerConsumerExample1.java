	// Above program using Anonymous Class

    class Resource
    {
        int value;
        {value = 0;}
        public int getValue(){return value;}
        public void produce() {
            value++;
            System.out.println("Produced - Value: "+value);
        }
        public void consume() {
            value--;
            System.out.println("Consumed - Value: "+value);
        }
    }
    
    class ProducerConsumerExample1
    {
        public static void main(String[] args) 
        {
            Resource rob = new Resource();
    
            // Producer
            Thread p = new Thread(){
                public void run() {
                    synchronized(rob) {
                        for(int i=0 ; i<15 ; i++) {
                            if(rob.getValue()==1)
                            {
                                try{ rob.wait(); } catch(Exception e){}
                            }
                            try{Thread.sleep(300);}catch(Exception e){}
                            rob.produce();
                            rob.notify();
                        }
                    }
                }
            };
    
            // Consumer
            Thread c = new Thread(){
                public void run() {
                    synchronized(rob) {
                        for(int i=0 ; i<15 ; i++) {
                            if(rob.getValue()==0)
                            {
                                try{ rob.wait(); } catch(Exception e){}
                            }
                            try{Thread.sleep(300);}catch(Exception e){}
                            rob.consume();
                            rob.notify();
                        }
                    }
                }
            };
    
            p.start();
            c.start();
        }
    }
    