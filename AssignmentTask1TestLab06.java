package CSE111_LAB06_OOP;

public class AssignmentTask1TestLab06 {
    public static void main(String [] args){
        AssignmentTask1Lab06 as1 = new AssignmentTask1Lab06();
        as1.printDetails();
        System.out.println("1---------------");
        as1.tasks = 11;
        as1.difficulty = "Moderate";
        as1.submission = true;
        as1.printDetails();
        System.out.println("2---------------");
        as1.makeOptional();
        System.out.println("3---------------");
        as1.printDetails();
        System.out.println("4---------------");
        AssignmentTask1Lab06 as2 = new AssignmentTask1Lab06();
        as2.tasks = 12;
        as2.difficulty = "Hard";
        as2.submission = false;
        as2.printDetails();
        System.out.println("5---------------");
        as2.makeOptional();
      }
    
}
