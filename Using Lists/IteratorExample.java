
import java.util.*;


public class IteratorExample {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Honeycomb");



        Iterator<String> ob1 =  list.iterator();
        
        while (ob1.hasNext()) {

            String name = ob1.next();
            System.out.println(name);
        }

    }
}