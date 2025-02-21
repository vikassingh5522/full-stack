
	// Now Using  void sort(Comparator<? super E> c) from Array List to sort Numbers

    import java.util.*;
    class CollectiosDemo {
        public static void main(String []args)
        {
            ArrayList<Integer> arlst=new ArrayList<Integer>();
            arlst.add(12);
            arlst.add(32);
            arlst.add(142);
            arlst.add(127);
            arlst.add(42);
            arlst.add(16);
            arlst.add(112);
            System.out.println("Entered Arraylist is: "+arlst);
    
            arlst.sort( (x,y)-> Integer.compare((int)x,(int)y) );
            System.out.println("Entered(ascending) Arraylist is: "+arlst);
    
            arlst.sort( (x,y)-> Integer.compare((int)y,(int)x) );
            System.out.println("Entered(descending) Arraylist is: "+arlst);
    
            // Using Collections
            
            Collections.sort(arlst);
            System.out.println("Entered(ascending) Arraylist is: "+arlst);
    
    
            Collections.sort(arlst,	(x,y)-> Integer.compare((int)y,(int)x));
            // for reverse order Collections class provides the prdefined comparator, Collections.reverseOrder()
            Collections.sort(arlst,	Collections.reverseOrder());
            System.out.println("Entered(descending) Arraylist is: "+arlst);
        }
    }