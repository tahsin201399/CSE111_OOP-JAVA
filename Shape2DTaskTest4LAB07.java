package CSE111_LAB07_OOP;

public class Shape2DTaskTest4LAB07 {
    public static void main(String[] args) {
        Shape2DTask4LAB07 sq = new Shape2DTask4LAB07(5);
        System.out.println("---------1----------");
        sq.area();
        System.out.println("---------2----------");
        Shape2DTask4LAB07 rectangle = new Shape2DTask4LAB07(5,6);
        System.out.println("---------3----------");
        rectangle.area();
        System.out.println("---------4----------");
        Shape2DTask4LAB07 tri1 = new Shape2DTask4LAB07(5,6,"Triangle");
        System.out.println("---------5----------");
        tri1.area();
        System.out.println("---------6----------");
        Shape2DTask4LAB07 tri2 = new Shape2DTask4LAB07(5,6,7);
        System.out.println("---------7----------");
        tri2.area();
        System.out.println("---------8----------");
      }
    
}
