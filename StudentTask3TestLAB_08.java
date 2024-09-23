package CSE111_LAB08_OOP;

public class StudentTask3TestLAB_08 {
    public static void main(String[] args) {
        StudentTask3LAB_08.printDetails();
        System.out.println("--------------------");
        StudentTask3LAB_08 mikasa = new StudentTask3LAB_08("Mikasa", 3.75);
        mikasa.individualDetail();
        System.out.println("--------------------");
        StudentTask3LAB_08.printDetails();
        System.out.println("--------------------");
        StudentTask3LAB_08 harry = StudentTask3LAB_08.createStudent("Harry", 2.5, "Charms");
        harry.individualDetail();
        System.out.println("--------------------");
        StudentTask3LAB_08.printDetails();
        System.out.println("--------------------");
        StudentTask3LAB_08 levi = new StudentTask3LAB_08("Levi", 3.33);
        levi.individualDetail();
        System.out.println("--------------------");
        StudentTask3LAB_08.printDetails();
      }
    
}
