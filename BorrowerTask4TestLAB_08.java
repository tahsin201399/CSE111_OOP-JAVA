package CSE111_LAB08_OOP;

public class BorrowerTask4TestLAB_08 {
    public static void main(String args[]){
        BorrowerTask4LAB_08.bookStatus();
        System.out.println("*********1*********");
        BorrowerTask4LAB_08 b1 = new BorrowerTask4LAB_08("Nabila");
        b1.borrowBook("Pather Panchali");
        b1.borrowBook("Anandmath");
        b1.borrowerDetails();
        System.out.println("*********2*********");
        BorrowerTask4LAB_08 b2 = new BorrowerTask4LAB_08("Sadia");
        b2.borrowBook("Anandmath");
        b2.borrowBook("Durgesh Nandini");
        b2.borrowBook("Pather Panchali");
        b2.borrowerDetails();
        System.out.println("*********3*********");
        System.out.println(BorrowerTask4LAB_08.remainingBooks("Anandmath")+" copies of Anandmath is remaining.");
        System.out.println("*********4*********");
        BorrowerTask4LAB_08 b3 = new BorrowerTask4LAB_08("Anika");
        b3.borrowBook("Anandmath");
        BorrowerTask4LAB_08.bookStatus();
        System.out.println("*********5*********");
        BorrowerTask4LAB_08 b4 = new BorrowerTask4LAB_08("Oishi");
        b4.borrowBook("Anandmath");
        b4.borrowBook("Durgesh Nandini");
        b4.borrowerDetails();
      }
    
}
