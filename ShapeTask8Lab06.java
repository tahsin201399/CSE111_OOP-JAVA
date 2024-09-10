package CSE111_LAB06_OOP;

public class ShapeTask8Lab06 {
    String name;
    double area;

    public void setParameters(String name , int x){
        if(name.equals("Circle")){
        this.name = name;
        this.area = 3.14 * x * x;
        }

    }
    public void setParameters(String name , double x , double y){
        if(name.equals("Triangle")){
        this.name = name;
        this.area = 0.5 * (x * y);
        }
    }
    public void setParameters(String name , double x , double y , double z){
        if(name.equals("Trapezium")){
        this.name = name;
        this.area = 0.5 * (x + y) * z;
        }

    }
    public String details(){
        return "Shape name : " + this.name
         + "\nArea : " + this.area;

    }
}
