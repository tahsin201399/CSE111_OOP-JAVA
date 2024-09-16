package CSE111_LAB07_OOP;

public class ParcelTask3LAB07 {
    String name;
    int weight;
    double fee;
    public ParcelTask3LAB07(){
        this.name = "";
        this.weight = 0;
        this.fee = 0.0;
       
    }

    public ParcelTask3LAB07(String a , int weight ){
        this.name = a;
        this.weight = weight;
        this.fee = 0.0;
    }
    public ParcelTask3LAB07(String a ){
        this.name = a;
        this.weight = 0;
        this.fee = 0.0;
    }

    public void printDetails(){
        if(this.name == ""){
            System.out.println("Set name first");
        }
        else{
        System.out.println("Name : " + this.name);
        System.out.println("Weight : " + this.weight);
        System.out.println("Fee : " + this.fee);
        }
    }
    public void calcFee(String loc){
        if(loc != "Dhanmondi"){
            this.fee = (this.weight * 20.0) + 0;
        }
        else{
            this.fee = (this.weight * 20.0) + 50;
        }
    }
    public void addWeight(int x){
        this.weight += x;
        System.out.println("Updated weight : " + this.weight);
    }
}
