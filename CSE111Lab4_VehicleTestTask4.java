package CSE111_LAB_OOP;

public class CSE111Lab4_VehicleTestTask4 {
    public static void main(String [] args){ 
        CSE111Lab4_VehicleTask4 car = new CSE111Lab4_VehicleTask4();
        System.out.println("Attributes of car object:");
        System.out.println(car.type);
        System.out.println(car.wheels);
        System.out.println(car.color);
        System.out.println("=========");
        CSE111Lab4_VehicleTask4 bike = new CSE111Lab4_VehicleTask4();
        bike.type="Motor bike";
        bike.wheels=2;
        bike.color="Red";
        System.out.println("Attributes of bike object:");
        System.out.println(bike.type);
        System.out.println(bike.wheels);
        System.out.println(bike.color);
      }
  
}
