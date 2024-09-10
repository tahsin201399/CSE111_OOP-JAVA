package CSE111_LAB06_OOP;

public class Course2Task7lab06{
    String name, code;
    String[] syllabus;
    int totalsubs = 0;
    int cap = 4;

    public void createCourse(String name, String code){
        this.name = name;
        this.code = code;
        syllabus = new String[cap];
    }

    public void printDetails(){
        System.out.println("Course details: ");
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Syllabus: ");

        if(totalsubs == 0){
            System.out.println("No content yet.");
        } 
        else{
            for (int i = 0; i < totalsubs; i++){
                if (i > 0) System.out.print(", ");
                System.out.print(syllabus[i]);
            }
            System.out.println();
        }
    }

    public void addContent(String x){
        if (totalsubs < cap){
            syllabus[totalsubs] = x;
            totalsubs++;
            System.out.println(x + " was added.");
        } 
        else{
            System.out.println("Cannot add more content");
        }
    }

    public void addContent(String x, String y){
        if(totalsubs < cap){
            syllabus[totalsubs] = x;
            totalsubs++;
            System.out.println(x + " was added.");

            if(totalsubs < cap){
                syllabus[totalsubs] = y;
                totalsubs++;
                System.out.println(y + " was added.");
            } 
            else{
                System.out.println("Cannot add more content");
            }
        } 
        else{
            System.out.println("Cannot add more content");
        }
    }
}
