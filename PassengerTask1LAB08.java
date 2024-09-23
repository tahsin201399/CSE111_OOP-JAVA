package CSE111_LAB08_OOP;

public class PassengerTask1LAB08 {
    public static int no_of_passenger ;
    public static double total_fare ;

    String name;
    double dis;
    double fare;
    double bagweight;

    public PassengerTask1LAB08(String a , double x){
        this.name = a;
        this.dis = x;
        this.bagweight = 0.0;
        no_of_passenger++;
    }
    public void setBaggageWeight(double a){
        this.bagweight = a;
    }
    public void passengerDetails(){
         fare = (20 * dis) + (10 * this.bagweight);
         total_fare += fare;

         System.out.println("Name: " + name);
        System.out.println("Fare: " + fare + " TK");
    }



}
