package CSE111_LAB05_OOP;

public class DogTestTask2Lab5 {
    public static void main (String[] args) {
        DogTask2Lab5 scooby = new DogTask2Lab5();
        DogTask2Lab5 oldie = new DogTask2Lab5();
        DogTask2Lab5 goofy = new DogTask2Lab5();
        
        scooby.changeName("Scooby");
        goofy.changeName("Goofy");
        
        System.out.println("1. ===============");
        System.out.println(scooby.bark());
        System.out.println("2. ===============");
        System.out.println(oldie.bark());
        System.out.println("3. ===============");
        oldie.changeColor("White");
        System.out.println("4. ===============");
        System.out.println(oldie.bark());
        System.out.println("5. ===============");
        System.out.println(goofy.bark());
        System.out.println("6. ===============");
        scooby.changeColor("Brown");
        System.out.println("7. ===============");
        System.out.println(scooby.bark());
        System.out.println("8. ===============");
        goofy.changeColor("Black");
    }
 
}
