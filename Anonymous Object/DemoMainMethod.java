


// class DemoMainMethod {
    
//      public void  sampleMethord()
//      {
//        System.out.println("\n In sampleMethord");
//      }
//      public static void main(String[] args)
//      {
//         System.out.println("\n main() starts");
//         sampleMethord();
//         System.out.println("\n main() ends");
//      }

// }

// DemoMainMethod.java:13: error: non-static method sampleMethord() cannot be referenced from a static context
// sampleMethord();
// ^
// 1 error


// solution 
//  --decl .sampleMethord() methode as static OR  create an object of class DemoMainMethod nad class sampleMethord() 

class DemoMainMethod {
    public static  void sampleMethord() {
        System.out.println("\n In sampleMethord");
    }
    public static void main(String[] args) {
        System.out.println("\n main() starts");
        sampleMethord();
        System.out.println("\n main() ends");
    }
}