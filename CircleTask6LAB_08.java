package CSE111_LAB08_OOP;

public class CircleTask6LAB_08 extends ShapeTask6LAB_08 {
    public double radius;

    public void area(){
        double area = 3.1416 * radius *radius;
        System.out.println("Area of " + color + " " + name + ": " + area);
    }
}
