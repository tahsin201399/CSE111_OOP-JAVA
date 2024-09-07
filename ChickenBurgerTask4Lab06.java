package CSE111_LAB06_OOP;

public class ChickenBurgerTask4Lab06 {
    String bun;
    int price;
    String sauceOption;
    String spiceLevel;

    public ChickenBurgerTask4Lab06() {
        this.bun = "Sesame";         
        this.price = 200;            
        this.sauceOption = "Less";   
        this.spiceLevel = "Not Set"; 
    }

    public void customizeSpiceLevel(String x) {
        if(x.equals("Spicy") || x.equals("Mild") || x.equals("Naga")) {
            spiceLevel = x;
            System.out.println("Spice level set to " + x + ".");
        } else {
            System.out.println("This spice level is unavailable.");
        }
    }

    public String serveBurger() {
        if (spiceLevel.equals("Not Set")) {
            return "Cannot serve now. Customize Spice Level first.";
        } else {
            return "The burger is being served:\n" +  // Added newline for better formatting
                "Bun Type: " + bun + "\n" +           // Added space after colon
                "Price: " + price + "\n" +            // Corrected price concatenation and added newline
                "Sauce Option: " + sauceOption + "\n" + // Added newline
                "Spice Level: " + spiceLevel;         // Corrected concatenation
        }
    }
}
