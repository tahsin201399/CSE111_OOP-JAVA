package CSE111_LAB07_OOP;

public class StudentTask1LAB07 {
    public String name , prog ;

    public StudentTask1LAB07(String name ,String dept){
        this.name = name;
        this.prog = dept;
        
    }
    public void updateName(String name){
        this.name = name;
    }
    public String accessName(){
        return this.name;
    }
    public void updateProgram(String x){
        this.prog = x;
    }
    public String accessProgram(){
        return this.prog;
    }

}
