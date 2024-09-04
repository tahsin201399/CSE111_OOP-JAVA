package CSE111_LAB06_OOP;

public class AssignmentTask1Lab06 {
    int tasks ;
    String difficulty ;
    Boolean submission = false;

    public void printDetails(){
        System.out.println("Number of tasks : " + tasks);
        System.out.println("Difficulty level : " + difficulty);
        System.out.println("Submission required : " + submission);

    }

    public void makeOptional(){
        if(submission = true){
            System.out.println("Submission is already not required");
        }
        else{
            System.out.println("Assignment will not require submission");
        }
    }
}
