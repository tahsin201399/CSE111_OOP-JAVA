package CSE111_LAB06_OOP;

public class ChickenBurgerTask4TestLab06 {
    public static void main(String [] args){
        ChickenBurgerTask4Lab06 b1 = new ChickenBurgerTask4Lab06();
        System.out.println(b1.bun);
        System.out.println(b1.price);
        System.out.println(b1.sauceOption);
        System.out.println(b1.spiceLevel);
        System.out.println("----------1----------");
        System.out.println(b1.serveBurger());
        System.out.println("----------2----------");
        b1.customizeSpiceLevel("Extreme Jhaal");
        b1.customizeSpiceLevel("Spicy");
        System.out.println("----------3----------");
        System.out.println(b1.serveBurger());
        System.out.println("----------4----------");
        ChickenBurgerTask4Lab06 b2 = new ChickenBurgerTask4Lab06();
        b2.bun = "Brioche";
        b2.price += 50;
        b2.sauceOption = "Regular";
        b2.customizeSpiceLevel("Naga");
        System.out.println("----------5----------");
        System.out.println(b2.serveBurger());
     }
   
}
