package CSE111_LAB05_OOP;

public class EmployeeTestTask3Lab5 {
    public static void main(String[] args){
        EmployeeTask3Lab5 emp1 = new EmployeeTask3Lab5();
        EmployeeTask3Lab5 emp2 = new EmployeeTask3Lab5();
        EmployeeTask3Lab5 emp3 = new EmployeeTask3Lab5();
        
        emp1.newEmployee("Harry Potter");
        emp2.newEmployee("Hermione Granger");
        emp3.newEmployee("Ron Weasley");
        System.out.println("1 ==========");
        emp1.displayInfo();
        System.out.println("2 ==========");
        emp2.displayInfo();
        System.out.println("3 ==========");
        emp3.displayInfo();
        System.out.println("4 ==========");
        emp1.calculateTax();
        System.out.println("5 ==========");
        emp1.promoteEmployee("lead");
        System.out.println("6 ==========");
        emp1.calculateTax();
        System.out.println("7 ==========");
        emp1.displayInfo();
        System.out.println("8 ==========");
        emp3.promoteEmployee("manager");
        System.out.println("9 ==========");
        emp3.calculateTax();
        System.out.println("10 ==========");
        emp3.displayInfo();
       }
  
}
