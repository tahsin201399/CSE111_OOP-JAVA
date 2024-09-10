package CSE111_LAB06_OOP;

public class CourseTask6TestLab06 {
    public static void main(String [] args){
        CourseTask6Lab06 c1 = new CourseTask6Lab06();
        c1.createCourse("PL II", "CS11");
        System.out.println("--------1--------");
        c1.printDetails();
        System.out.println("--------2--------");
        c1.addOneContent("Overloading");
        c1.printDetails();
        System.out.println("--------3--------");
        c1.addOneContent("Encapsulation");
        c1.addTwoContent("Static", "Polymorphism");
        c1.printDetails();
        System.out.println("--------4--------");
        c1.addOneContent("Inheritance");
        System.out.println("--------5--------");
        CourseTask6Lab06 c2 = new CourseTask6Lab06();
        c2.createCourse("DS", "CS22");
        c2.addOneContent("Stack");
        c2.addTwoContent("Recursion","Tree");
        c2.addTwoContent("Heap","Hashing");
        System.out.println("--------6--------");
        c2.printDetails();
      }
    
}
