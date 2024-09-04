package CSE111_LAB06_OOP;

public class ShelfTask2TestLab06 {
    public static void main(String [] args){
        ShelfTask2Lab06 shelf = new ShelfTask2Lab06();
        shelf.showDetails();
        System.out.println("1---------------");
        shelf.addBooks(3);
        System.out.println("2---------------");
        shelf.capacity = 7;
        shelf.addBooks(3);
        System.out.println("3---------------");
        shelf.showDetails();
        System.out.println("4---------------");
        shelf.addBooks(5);
        shelf.showDetails();
        shelf.capacity += 4;
        System.out.println("6---------------");
        shelf.addBooks(5);
        shelf.showDetails();
      }
    
}
