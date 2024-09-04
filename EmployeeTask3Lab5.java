package CSE111_LAB05_OOP;

public class EmployeeTask3Lab5 {
    public String name ;
    public double salary = 30000.0;
    public String designation = "Junior";

    public void newEmployee(String x){
        this.name = x;
    }
    public void displayInfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee salary: " + salary + " Tk");
        System.out.println("Employee Designation: " + designation);
    }

    public void promoteEmployee(String y){
        this.designation = y;
        if(y == "lead"){
            this.salary += 50000.0;
            System.out.println(name + " has been promoted to " + designation);
            System.out.println("New salary : " + salary);

        }
        else if (y == "manager"){
            this.salary += 75000.0;
            System.out.println(name + " has been promoted to " + designation);
            System.out.println("New salary : " + salary);

        }
        else if (y == "senior"){
            this.salary += 25000.0;
            System.out.println(name + " has been promoted to " + designation);
            System.out.println("New salary : " + salary);

        }

    }
    public void calculateTax(){
        double taxamount = 0;
        if(this.salary == 30000.0){
            System.out.println("No need to pay tax ");
            return;

        }
        else if (this.salary >= 30000.0 && this.salary <= 50000.0){
            taxamount = 0.01;
        }
        else if (this.salary >= 50000.0){
            taxamount = 0.3;
        }
        double tax = this.salary * taxamount;
        System.out.println(this.name + " tax ammount : " + tax);

    }
}
