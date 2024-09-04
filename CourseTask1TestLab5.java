package CSE111_LAB05_OOP;

public class CourseTask1TestLab5 {
    public static void main(String[] args) {
        CourseTask1Lab5 c1 = new CourseTask1Lab5();
        CourseTask1Lab5 c2 = new CourseTask1Lab5();
        
        System.out.println("========== 1 ==========");
        c1.createCourse("Programming Language I", "CSE110", 3);
        c1.displayCourse();
        
        System.out.println("========== 2 ==========");
        c2.createCourse("Data Structures", "CSE220", 3);
        c2.displayCourse();
        
        System.out.println("========== 3 ==========");
        c1.updateCourse("Programming Language II", "CSE111", 3);
        c1.displayCourse();
    }
}
