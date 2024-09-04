package CSE111_LAB05_OOP;

public class CourseTask1Lab5 {
    public String cName;
    public String code;
    public int credit;

    public void createCourse(String x, String y, int z) {
        cName = x;
        code = y;
        credit = z;
    }

    public void updateCourse(String x, String y, int z) {
        cName = x;
        code = y;
        credit = z;
    }

    public void displayCourse() {
        System.out.println("Course name : " + cName);
        System.out.println("Course Code : " + code);
        System.out.println("Course credit : " + credit);
    }
}
