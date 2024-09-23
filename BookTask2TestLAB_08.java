package CSE111_LAB08_OOP;

public class BookTask2TestLAB_08 {
    public static void main(String[] args) {
        System.out.println("Total Books Sold: " + BookTask2LAB_08.total_books_sold);
        System.out.println("Total Revenue: "+BookTask2LAB_08.total_revenue + " TK");
        System.out.println("==========1==========");

        BookTask2LAB_08 b1 = new BookTask2LAB_08("Java Programming", 10); // 10% discount
        b1.bookDetails();

        System.out.println("==========2==========");

        BookTask2LAB_08 b2 = new BookTask2LAB_08("Python Programming", 15); // 15% discount
        b2.bookDetails();

        System.out.println("==========3==========");

        BookTask2LAB_08 b3 = new BookTask2LAB_08("Data Structures", 5); // 5% discount
        b3.bookDetails();

        System.out.println("==========4==========");
        System.out.println("Total Books Sold: " + BookTask2LAB_08.total_books_sold);
        System.out.println("Total Revenue: "+BookTask2LAB_08.total_revenue + " TK");
    }

}
