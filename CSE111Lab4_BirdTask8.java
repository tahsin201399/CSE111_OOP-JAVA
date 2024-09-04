package CSE111_LAB_OOP;

public class CSE111Lab4_BirdTask8 {
    String name ;
    int x = 0;

    public void flyUp(int feet){
        x += feet;
        System.out.println(name + " has flown up " + feet + " feet.");

    }
    public void flyDown(int feet){
        if(x - feet < 0){
        System.out.println(name + " cannot fly down " + feet + " feet.");
        }
        else{
            x -= feet;
            if(x == 0){
            System.out.println(name + " has flown down " + feet + " feet and landed.");
            } 
            else{
            System.out.println(name + " has flown down " + feet + " feet.");
            }
        }

    }
    public void makeNoise(){
        if(name.equals("Parrot")){
        System.out.println("Squawk");
        } 
        else if(name.equals("Eagle")){
        System.out.println("Squee");
    }
}
}
