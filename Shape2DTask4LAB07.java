package CSE111_LAB07_OOP;

public class Shape2DTask4LAB07 {
    double length , breadth , height ,  base , sidea, sideb, sidec;
    String shape;

    public  Shape2DTask4LAB07(double x){
        this.length = x;
        this.shape = "Square";
        System.out.println("A Square has been created with length: " + this.length);

    }
    public  Shape2DTask4LAB07(double x , double y){
        this.length = x;
        this.breadth = y;
        this.shape = "Rectangle";

        System.out.println("A Rectangle  has been created with length: " + this.length + " and breadth : " +  this.breadth);

    }
    public  Shape2DTask4LAB07(double x , double y , String shape){
        if (shape == "Triangle") {
        this.height = x;
        this.base = y;
        this.shape = "Triangle";
        System.out.println("A Triangle has been created with height : " + this.height + " and breadth : " +  this.base);
        }

    }
    public  Shape2DTask4LAB07(double x , double y , double z){
        this.sidea = x;
        this.sideb = y;
        this.sidec = z;
        this.shape = "Triangle";
        System.out.println("A Triangle has been created with the following sides: " + this.sidea + " ," +this.sideb + " ," +this.sidec);

    }
    public void area(){
        if(shape .equals("Square")){
            double area = length*length;
            System.out.println("The area of the Square is: " + area);
        }
        else if(shape.equals("Rectangle")){
            double area = length * breadth;
            System.out.println("The area of the Rectangle is: " + area);
        } 
        else if(shape.equals("Triangle")&&height != 0&&base != 0){
            double area = 0.5 * height * base;
            System.out.println("The area of the Triangle is: " + area);
        }
        else if(shape.equals("Triangle") &&sidea != 0&&sideb != 0&&sidec != 0){
            double s = (sidea + sideb + sidec) / 2;
            double area = Math.sqrt(s * (s - sidea) * (s - sideb) * (s - sidec));
            System.out.printf("The area of the Triangle is: %.2f%n", area);
        }
    }

}
