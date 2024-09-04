package CSE111_LAB05_OOP;

public class DogTask2Lab5 {
    public String name ;
    public String color;

    public void changeName(String newName){
        this.name = newName;
    }
    public void changeColor(String newColor){
        this.color = newColor;
        if(name == null){
        System.out.println("This dog is " + newColor);
        }
        else if(name != null){
            System.out.println(name+ " is " + newColor);

        }
    }

    public String bark(){
        if(name != null && color != null){
            return (name + " the " + color + " dog is barking.");
        }
        else if(name != null){
            return (name + " is barking .");
        }
        else if(color != null){
            return(color + " dog is barking. ");
        }
        else{
            return "A dog is barking ";
        }
        
    }
}
