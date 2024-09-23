package CSE111_LAB08_OOP;

public class StudentTask3LAB_08 {
    public static int totalstudents = 0;
    public static int csestudents = 0;
    public static int otherdeptstudents = 0;

    String name;
    int id;
    double cgpa;
    String department;

    public StudentTask3LAB_08(String name , double cg){
        this.name = name;
        this.cgpa = cg;
        this.department = "CSE";
        this.id = idincrement();
        csestudents++;
    }
    public StudentTask3LAB_08(String name , double cg, String dept){
        this.name = name;
        this.cgpa = cg;
        this.department = dept;
        this.id = idincrement();
        if(dept.equalsIgnoreCase("CSE")){
            csestudents++;
        }
        else{
            otherdeptstudents++;
        }
    }

    public static int idincrement(){
        totalstudents++;
        return totalstudents;
    }
    public void individualDetail(){
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("CGPA : " + this.cgpa);
        System.out.println("Department : " + this.department);

    }
    public static void printDetails(){
        System.out.println("Total Student(s): " + totalstudents);
        System.out.println("CSE Student(s): " + csestudents);
        System.out.println("Other Department Student(s): " + otherdeptstudents);
    }

public static StudentTask3LAB_08 createStudent(String name, double cg, String dept){
    if(dept.equalsIgnoreCase("CSE")){
        return new StudentTask3LAB_08(name, cg);
    }
    else{
        return new StudentTask3LAB_08(name, cg , dept);
    }

}

}
