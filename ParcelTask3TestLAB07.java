package CSE111_LAB07_OOP;

public class ParcelTask3TestLAB07 {
    public static void main(String[] args){
        ParcelTask3LAB07 p1 = new ParcelTask3LAB07();
        p1.printDetails();
        p1.name = "Spongebob";
        p1.printDetails();
        System.out.println("1**************");
        ParcelTask3LAB07 p2 = new ParcelTask3LAB07("Bob the Builder");
        p2.weight = 15;
        p2.calcFee("Gulshan");
        p2.printDetails();
        System.out.println("2**************");
        p2.addWeight(25);
        p2.calcFee("Banani");        
   p2.printDetails();
        System.out.println("3**************");
        ParcelTask3LAB07 p3 = new ParcelTask3LAB07("Dora the Explorer", 10);
        p3.addWeight(15);
        p3.calcFee("Dhanmondi");
        p3.printDetails();
     }
  
}
