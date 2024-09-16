package CSE111_LAB07_OOP;

public class ProductTask6LAB07 {
    private String name;
    private double price;
    private int x;
    public ProductTask6LAB07(){
        this.name = "Unknown";
        this.price = 0.0;
        this.x = 0;
    }
    public ProductTask6LAB07(String n , double x){
        this.name = n;
        this.price = x;
        this.x = 0;
    }
    public void setQuantity(int x){
        this.x = x;
    }
    public int getQuantity(){
        return x;
    }
    public double getPrice(){
        return price;
    }
    public void displayInfo(){
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
    public void displayInfo(boolean x){
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        if(x){
            System.out.println("Quantity: " + x);
        }
    }
}
