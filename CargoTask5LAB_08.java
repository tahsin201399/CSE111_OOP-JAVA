package CSE111_LAB08_OOP;

public class CargoTask5LAB_08 {
    public static double totalCapacity = 10.0;
    public static int idTracker = 1;
    public String component;
    public int cargoid;
    public double weight;
    public boolean find;

    public CargoTask5LAB_08(String a , double x){
        this.component = a;
        this.weight = x;
        this.find = false;
        this.cargoid = idTracker++;
    }
    public void details(){
        System.out.println("Cargo ID: " + cargoid + " , Contents : " + component + " , Weight : " + weight + " , Loaded : " + find);
    }
    public void load(){
        if(!find && weight <= totalCapacity){
            find = true;
            totalCapacity -= weight;
            System.out.println("Cargo " + cargoid + " loaded for transport.");
        }
        else if(find){
            System.out.println("Cargo " + cargoid + " is already loaded.");    
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }
    public void unload(){
        if(find){
            find = false;
            totalCapacity += weight;
            System.out.println("Cargo " + cargoid +" Unloaded .");
        }
        else{
            System.out.println("Cargo " + cargoid +" is not loaded .");
        }
    }
    public static double capacity(){
        return totalCapacity;
    }

}
