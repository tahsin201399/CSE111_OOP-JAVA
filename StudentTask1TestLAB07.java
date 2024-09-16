package CSE111_LAB07_OOP;

public class StudentTask1TestLAB07 {
    public static void main(String[] args){
        StudentTask1LAB07 s1 = new StudentTask1LAB07("Harry", "CSE");
        System.out.println(s1.name);
        s1.updateName("Harry Potter");
        System.out.println(s1.accessName());
        System.out.println(s1.prog);
        s1.updateProgram("CS");
        String prog = s1.accessProgram();
        System.out.println(prog);
    }
 
}
