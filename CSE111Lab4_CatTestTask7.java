package CSE111_LAB_OOP;

public class CSE111Lab4_CatTestTask7 {
    public static void main(String [] args){ 
        CSE111Lab4_CatTask7 c1 = new CSE111Lab4_CatTask7(); 
        System.out.println("===================");
        c1.printCat();
        c1.color = "Black"; 
        System.out.println("===================");
        c1.printCat(); 
        c1.color = "Brown"; 
        c1.action = "jumping"; 
        System.out.println("===================");
        c1.printCat(); 
    } 

}
