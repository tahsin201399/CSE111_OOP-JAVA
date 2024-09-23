package CSE111_LAB08_OOP;

public class PassengerTaskTest1LAB08 {
    public static void main(String args[]){
        System.out.println("Total Passenger: "+ PassengerTask1LAB08.no_of_passenger);
        System.out.println("Total Fare: "+ PassengerTask1LAB08.total_fare + " TK");
        System.out.println("==========1==========");
        PassengerTask1LAB08 p1 = new PassengerTask1LAB08("Lara", 5.6);
        p1.passengerDetails();
        System.out.println("==========2==========");
        PassengerTask1LAB08 p2 = new PassengerTask1LAB08("Kevin", 10);
        p2.setBaggageWeight(6.8);
        p2.passengerDetails();
        System.out.println("==========3==========");
        PassengerTask1LAB08 p3 = new PassengerTask1LAB08("Robin", 2.3);
        p3.setBaggageWeight(5);
        p3.passengerDetails();
        System.out.println("==========4==========");
        System.out.println("Total Passenger: "+ PassengerTask1LAB08.no_of_passenger);
        System.out.println("Total Fare: "+ PassengerTask1LAB08.total_fare + " TK");
      }
    
}
