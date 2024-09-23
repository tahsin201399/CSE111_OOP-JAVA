package CSE111_LAB08_OOP;

public class DogTask7LAB_08 extends AnimalTask7LAB_08 {
    public String name;

    public DogTask7LAB_08(){
        System.out.println("The dog says hello!");
    }
    public String getName(){
        return name;
    }
    public void updateSound(String newsound) {
        this.sound = newsound;
    }
}
