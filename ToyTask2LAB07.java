package CSE111_LAB07_OOP;

public class ToyTask2LAB07 {
    String name;
    int price ;

    public ToyTask2LAB07(String a , int b){
        this.name = a;
        this.price = b;
    System.out.println("A new toy has been made!");
    }
    public void updatePrice(int z){
        this.price = z;
    }
    public void showPrice(){
        System.out.println("Price : " + this.price);
    }

    public void updateName(String y){
        this.name = y;
    }
}
