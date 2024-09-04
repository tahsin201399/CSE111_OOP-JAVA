package CSE111_LAB05_OOP;

//import java.io.Reader;

public class ReaderTestTask7Lab5 {
    public class Reader_tester {
   public static void main(String[] args){
    ReaderTask7Lab5 r1 = new ReaderTask7Lab5();
    ReaderTask7Lab5 r2 = new ReaderTask7Lab5();
       
       r1.createReader("Messi", 2);
       r2.createReader("Ronaldo", 5);
       
       System.out.println("1 ==========");
       r1.readerInfo();
       
       System.out.println("2 ==========");
       r2.addBook("Java");
       r2.addBook("Python");
       r2.addBook("C++");
       r2.readerInfo();
       
       System.out.println("3 ==========");
       r1.addBook("C#");
       r1.addBook("Rust");
       r1.addBook("GoLang");
       
       System.out.println("4 ==========");
       r1.increaseCapacity(5);
       r1.addBook("Python");
       
       System.out.println("5 ==========");
       r1.readerInfo();
   }
}
}
