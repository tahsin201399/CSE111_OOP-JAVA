package CSE111_LAB08_OOP;

public class BookTask2LAB_08 {
    public static int total_books_sold = 0 ;
    public static double total_revenue = 0.0;
    String title;
    int discount;
    double price;
    double base_price = 150.0;

    public BookTask2LAB_08(String name , int dis){
        this.title = name;
        this.discount = dis;
        total_books_sold++;
        this.price = calcprice();
        total_revenue += this.price;
    }
    public  double calcprice(){
        return this.price = base_price - base_price*(discount / 100);
    }
    public void bookDetails(){
        System.out.println("Title : " + title);
        System.out.println("Price after Discount: " + price + " TK");

    }

}
