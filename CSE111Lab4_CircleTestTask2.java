package CSE111_LAB_OOP;

public class CSE111Lab4_CircleTestTask2 {
    public static void main(String [] args){
        CSE111Lab4_CircleTask2 r1 = new CSE111Lab4_CircleTask2();

        System.out.println("Radius of the circle is " + r1.radius);

        double pie = 3.141592653589793238;

        System.out.println("The area of the circle is  " + pie * Math.pow(r1.radius, 2));
        System.out.println("The circumference of the circle is  " + 2 * pie * r1.radius);



    }
}
