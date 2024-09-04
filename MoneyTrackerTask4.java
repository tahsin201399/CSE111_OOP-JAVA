package CSE111_LAB05_OOP;

public class MoneyTrackerTask4 {
     String name;
     double balance = 0.0;
     double lastadd = 0.0;
     double lastspent = 0.0;

    public String info(){
        return "Name: " + name + "\n" + "Current Balance: " + balance;
    }

    public void createTracker(String a) {
        name = a;
        this.balance = 1.0;
    }

    public void income(double x){
        balance += x;
        lastadd = x;
        System.out.println("Balance Updated!");
    }

    public void expense(double y){
        if(balance > y){
            balance -= y;
            lastspent = y ;
            System.out.println("Balance Updated.");
    }
    else{
            if(balance == y){
                System.out.println("You are broke.");
            }
            else {
                System.out.println("Not enough balance.");
            }
    }
}
    

    public void showHistory() {
        System.out.println("Last added: " + lastadd);
        System.out.println("Last spent: " + (lastspent));
    }
}
