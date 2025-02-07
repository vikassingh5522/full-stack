


            //  eg, NumberFormatException






// public class Nfe {
//     public static void main(String[] args) {
     
//         String str = "vikassembly";
//         int a=Integer.parseInt(str);
//         System.out.println(a);
//         System.out.println("string NumberFormatException expected");
//     }
// }

// Exception in thread "main" java.lang.NumberFormatException: For input string: "vikassembly"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:661)
//         at java.base/java.lang.Integer.parseInt(Integer.java:777)
//         at Nfe.main(Nfe.java:8)



public class Nfe {

    public static void main(String[] args) {
        
        String str = "vikas";

        try {
            int a=Integer.parseInt(str);
            System.out.println(a);
            System.out.println("string NumberFormatException expected");
            
        } catch (Exception e) {
          System.out.println( "strimg "+str+" can not be  converted to intger ");
        }
    }
}