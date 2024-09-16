package CSE111_LAB07_OOP;

public class ToyTask2TestLAB07 {
    public static void main(String[] args){
        ToyTask2LAB07 t1 = new ToyTask2LAB07("Car", 230);
        System.out.println("1=================");
        t1.updatePrice(250);
        System.out.println("2=================");
        System.out.println(t1.name);
        t1.showPrice();
        System.out.println("3=================");
        ToyTask2LAB07 t2 = new ToyTask2LAB07("Robot", 450);
        System.out.println("4=================");
        t2.updateName("Autobot");
        System.out.println("5=================");
        System.out.println(t2.name);
        t2.showPrice();
    }

}
