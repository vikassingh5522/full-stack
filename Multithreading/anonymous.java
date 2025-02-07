// Using the anonymous inner class:

	// Using Thread class
    class anonymous
    {
        public static void main(String[] args) 
        {
            System.out.println("Main Started...!!!");
    
            Thread t1 = new Thread() {
                public void run() {
                    for(int i=0 ; i<20 ; i++) {
                        System.out.println("t1 - "+i);
                        try{ Thread.sleep(600); } catch(Exception e){}
                    }
                }
            };
            t1.start();
    
            for(int i=0 ; i<20 ; i++) {
                    System.out.println("main - "+i);
                    try{ Thread.sleep(1200); } catch(Exception e){}
            }
    
            System.out.println("Main ended...!!!");
        }
    }
    