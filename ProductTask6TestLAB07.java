package CSE111_LAB07_OOP;

public class ProductTask6TestLAB07 {
    public static void main(String[] args) {
        System.out.println("< —--—----1—-------->");
        ProductTask6LAB07 product1 = new ProductTask6LAB07();
        product1.displayInfo();
        System.out.println();
        System.out.println("< —--—----2—-------->");
        ProductTask6LAB07 product2 = new ProductTask6LAB07("Laptop", 1200.00);
        product2.setQuantity(10);
        product2.displayInfo(true); 
        System.out.println("< —--—----3—-------->");
        System.out.println("Retrieved Price: $" + product2.getPrice());
        System.out.println("Retrieved Quantity: " + product2.getQuantity());
          }
    
}
