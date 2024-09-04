package CSE111_LAB_OOP;

public class CSE111Lab4_CellPhoneTestTask9 {
    public static void main(String[]args){
        CSE111Lab4_CellPhoneTask9 phone1 = new CSE111Lab4_CellPhoneTask9();
        phone1.printDetails();
        phone1.model ="Nokia 1100";
        System.out.println("1##################");
        phone1.storeContact("Joy - 01834");
        phone1.printDetails();
        System.out.println("2##################");
        phone1.storeContact("Toya - 01334");
        phone1.storeContact("Aayan - 01135");
        phone1.printDetails();
        System.out.println("3##################");
        phone1.storeContact("Sani - 01441");
        phone1.printDetails();  
     }
   
}
