package CSE111_LAB06_OOP;

public class ShapeTask8TestLab06 {
    public static void main(String args []){
        ShapeTask8Lab06 circle = new ShapeTask8Lab06();
        ShapeTask8Lab06 triangle = new ShapeTask8Lab06();
        ShapeTask8Lab06 trapezium = new ShapeTask8Lab06();
        
        circle.setParameters("Circle", 5);
        triangle.setParameters("Triangle", 4, 7);
        trapezium.setParameters("Trapezium", 2, 4, 9);
        
        System.out.println(circle.details());
        System.out.println("---------------");
        System.out.println(triangle.details());
        System.out.println("---------------");
        System.out.println(trapezium.details());  
      }
    
}
