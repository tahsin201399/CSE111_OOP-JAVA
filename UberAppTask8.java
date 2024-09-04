package CSE111_LAB05_OOP;

public class UberAppTask8 {
    public String name ;
    public int age;
    public String number;
    String [] ride = new String [3];
    int idx = 0;
    int remride = 3;
    double fare;

    public void createProfile(String x, int y, String z){
        name = x;
        age = y;
        number = z;
    }
    public void showProfile(){
        System.out.println("Hello! This is your profile: ");
        System.out.println("Full name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + number);
    }
    public int remainingRides(){
        int a = remride;
        return a;

    }
    public void bookRide(String b, double c){
        if(remride > 0) {
            ride[idx] = b;
            idx++;
            remride--;
            fare = 30 * c;
            System.out.println(name + " has booked a ride!");
            System.out.println("Destination: " + b);
            System.out.println("Fare: " + fare + " Taka");
        } 
        else{
            System.out.println(name + ", please update your plan to premium or wait till next month!");
        }
    }
    
    public void changeLocation(String d , double e ){
        if (idx > 0) {
            ride[idx - 1] = d;
            fare = e * 30 + (e * 30) * 0.2;
            System.out.println(name + " has changed the destination of his current ride to " + d);
            System.out.println("New fare after adding 20% change fees: " + fare + " Taka");
        } 
    }
    public void ridingHistory(){
        if(idx == 0){
            System.out.println(name + ", you haven't visited anywhere this month.");
        } 
        else{
            System.out.print(name + ", you have visited ");
            for(int i = 0; i < idx; i++){
                System.out.print(ride[i]);
                if(i < idx - 1){
                    System.out.print(", ");
                }
            }
            System.out.println(" this month.");
        }
    }
    public void resetMonth(){
        ride = new String[3];
        idx = 0;
        remride = 3;
        System.out.println(name + "'s ride history reset for the new month.");
    }



    
}
