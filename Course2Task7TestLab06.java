package CSE111_LAB06_OOP;

public class Course2Task7TestLab06 {
    public static void main(String [] args){
        Course2Task7lab06 c1 = new Course2Task7lab06();
        c1.createCourse("PL II", "CS11");
        System.out.println("--------1--------");
        c1.printDetails();
        System.out.println("--------2--------");
        c1.addContent("Overloading");
        c1.printDetails();
        System.out.println("--------3--------");
        c1.addContent("Encapsulation");
        c1.addContent("Static", "Polymorphism");
        c1.printDetails();
        System.out.println("--------4--------");
        c1.addContent("Inheritance");
        System.out.println("--------5--------");
        Course2Task7lab06 c2 = new Course2Task7lab06();
        c2.createCourse("DS", "CS22");
        c2.addContent("Stack");
        c2.addContent("Recursion","Tree");
        c2.addContent("Heap","Hashing");
        System.out.println("--------6--------");
        c2.printDetails();
      }
    
}
