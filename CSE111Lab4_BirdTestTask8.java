package CSE111_LAB_OOP;

public class CSE111Lab4_BirdTestTask8{
    public static void main(String args[]) { 
        CSE111Lab4_BirdTask8 b1 = new CSE111Lab4_BirdTask8();
        b1.name = "Parrot";
        b1.flyUp(3);
        b1.makeNoise();
        b1.flyDown(5);
        b1.flyDown(2);
        b1.flyDown(1);
        CSE111Lab4_BirdTask8 b2 = new CSE111Lab4_BirdTask8();
        b2.name = "Eagle"; 
        b2.flyUp(5);
        b2.flyDown(5);
        b2.makeNoise(); 
    }  
}


