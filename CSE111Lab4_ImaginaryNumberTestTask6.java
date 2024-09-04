package CSE111_LAB_OOP;

public class CSE111Lab4_ImaginaryNumberTestTask6 {
    public static void main(String [] args){
        CSE111Lab4_ImaginaryNumberTask6 num1 = new CSE111Lab4_ImaginaryNumberTask6();
        num1.printNumber();
        System.out.println("1********");
        num1.realPart=3;
        num1.imaginaryPart=7;
        num1.printNumber();
        System.out.println("2********");
        CSE111Lab4_ImaginaryNumberTask6 num2 = new CSE111Lab4_ImaginaryNumberTask6();
        num2.realPart=1;
        num2.imaginaryPart=9;
        num2.printNumber();
       }
   
}
