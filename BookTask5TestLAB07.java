package CSE111_LAB07_OOP;

public class BookTask5TestLAB07 {
    public static void main(String[] args) {
        System.out.println("< —--—----1—-------->");
        BookTask5LAB07 b1 = new BookTask5LAB07("The Alchemist");
        b1.displayDetails(); 
        System.out.println("< —--—----2—-------->");
        BookTask5LAB07 b2 = new BookTask5LAB07("1984", "George Orwell");
        b2.displayDetails();  
        System.out.println("< —--—----3—-------->");
        BookTask5LAB07 b3 = new BookTask5LAB07("To Kill a Mockingbird", "Harper Lee", 300);
        b3.displayDetails();
        System.out.println("< —--—----4—-------->");
        b1.setDetails(250); 
        b1.displayDetails();  
        System.out.println("< —--—----5—-------->");
        b2.setDetails("Orwell", 350); 
        b2.displayDetails();  
     }
   
}
