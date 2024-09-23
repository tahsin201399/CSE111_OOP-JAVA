package CSE111_LAB08_OOP;

public class AnimalTesterTask7LAB_08 {
    public static void main(String args[]){
        AnimalTask7LAB_08 a1 = new AnimalTask7LAB_08();
        System.out.println("1-------------");
        a1.details();
        System.out.println("2-------------");
        DogTask7LAB_08 d1  = new DogTask7LAB_08();
        d1.name = "Pammy";
        System.out.println("3-------------");
        System.out.println("Name: " + d1.getName());
        d1.details();
        System.out.println("4-------------");
        d1.updateSound("Bark");
        System.out.println("5-------------");
        d1.details();
      }
    
}
