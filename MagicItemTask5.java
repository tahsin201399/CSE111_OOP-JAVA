package CSE111_LAB05_OOP;

public class MagicItemTask5 {
    String charname ;
    int energylvl = 0;
    String [] itemname = new String [3];
    int remitemslots = 3;

    public void newCharacter(String name){
        this.charname = name;
    }
    public void displayInfo(){
        System.out.println("Charecter Name : "+charname);
        System.out.println("Energy Level : "+energylvl);
        for(int i = 0 ; i < itemname.length; i++){
            System.out.println("Item " + (i+1 )+ " :" + itemname[i]);
        }
    }
    public void findItem(String x ){
        if(remitemslots > 0){
            for(int i = 0 ; i < itemname.length ; i ++){
                if(itemname[i] == null){
                    itemname[i] = x;
                    remitemslots--;
                    System.out.println(charname + " found a " + x);
                    return;
                }
            }
        }
        else{
            System.out.println("All items are occupied");
        }

    }
    public void useItem(String y){
        for(int i = 0 ; i < itemname.length ; i++){
            if(y.equals(itemname[i])){
                itemname[i] = null;
                remitemslots++;
                if(y == "Potion"){
                    energylvl += 50;
                } 
                else if(y == "Elixir"){
                    energylvl += 100;
                } 
                else if(y == "Amulet"){
                    energylvl += 200;
                }
                

                System.out.println(charname + " used a " + y);
                System.out.println("Energy Level after using item: " + energylvl);
                return;
            }
        }
        System.out.println("Item not in inventory.");
    }
}
