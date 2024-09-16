package CSE111_LAB07_OOP;

public class BookTask5LAB07 {
    String name , auth;
    int price;
     
    public BookTask5LAB07(String x){
        this.name = x;
    }

    public BookTask5LAB07(String x , String y){
        this.name = x;
        this.auth = y;
    }
    public BookTask5LAB07(String x , String y , int p){
        this.name = x;
        this.auth = y;
        this.price = p;
    }
    public void setDetails(int a){
        this.price = a;
    }
    public void setDetails(String f ,int a ){
        this.auth = f;
        this.price = a;
    }
    public void displayDetails(){
        if(auth == null && price == 0){
            System.out.println("Title: " + name);
        }
        else if (auth != null && price == 0){
            System.out.println("Title: " + name + ", Author: " + auth);
        }
        else if (auth == null && price !=0){
            System.out.println("Title: " + name + ", Price: " + price);
        }
        else{
            System.out.println("Title: " + name + ", Author: " + auth + ", Price: " + price);
        }
    }
}
