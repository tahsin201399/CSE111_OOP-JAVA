package CSE111_LAB06_OOP;

public class MobilePhoneTask5TestLab06 {
    public static void main(String args []){
        MobilePhoneTask5Lab06 m1 = new MobilePhoneTask5Lab06();
        MobilePhoneTask5Lab06 m2 = new MobilePhoneTask5Lab06();
        m1.setContactCapacity(5);
        m2.setContactCapacity(100);
        m1.details();
        System.out.println("1----------------");
        m1.addContact("John", 9866);
        m1.addContact("Maria", 7865);
        System.out.println("2----------------");
        m1.makeCall(9866);
        System.out.println("3----------------");
        m1.addContact("Henry", 2365);
        System.out.println("4----------------");
        m1.makeCall(7552);
        m1.makeCall(2365);
        System.out.println("5----------------");
        m1.addContact("Gomes", 4589);
        m1.addContact("Antony", 8421);
        m1.addContact("Tony", 5789);
        System.out.println("6----------------");
        m1.details();
      }
    
}
