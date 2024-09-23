package CSE111_LAB08_OOP;

public class CargoTask5TestLAB_08 {
    public static void main(String[] args) {
        System.out.println("Cargo Capacity: " + CargoTask5LAB_08.capacity());
        System.out.println("1====================");
        CargoTask5LAB_08 a = new CargoTask5LAB_08("Industrial Machinery", 4.5);
        a.details();
        System.out.println("2====================");
        a.load();
        System.out.println("3====================");
        CargoTask5LAB_08 b = new CargoTask5LAB_08("Steel Ingot", 2.7);
        b.details();
        System.out.println("4====================");
        System.out.println("Cargo Capacity: " + CargoTask5LAB_08.capacity());
        System.out.println("5====================");
        b.load();
        System.out.println("Cargo Capacity: " + CargoTask5LAB_08.capacity());
        System.out.println("6====================");
        CargoTask5LAB_08 c = new CargoTask5LAB_08("Tree Trunks", 3.6);
        c.load();
        System.out.println("7====================");
        c.details();
        b.details();
        System.out.println("8====================");
        CargoTask5LAB_08 d = new CargoTask5LAB_08("Processed Goods", 1.8);
        d.load();
        System.out.println("Cargo Capacity: " + CargoTask5LAB_08.capacity());
        System.out.println("9====================");
        b.unload();
        System.out.println("Cargo Capacity: " + CargoTask5LAB_08.capacity());
        System.out.println("10====================");
        c.load();
        System.out.println("11====================");
        b.details();
        System.out.println("Cargo Capacity: " + CargoTask5LAB_08.capacity());
      }
    
}
