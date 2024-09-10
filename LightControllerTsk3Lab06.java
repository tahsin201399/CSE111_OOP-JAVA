package CSE111_LAB06_OOP;

public class LightControllerTsk3Lab06 {
    int status;
    int level;


    public void showLightStatus(){
        if(status == 1){
            System.out.println("Light status: ON");
        } 
        else{
            System.out.println("Light status: OFF");
        }
        System.out.println("Brightness Level: " + level);
    }
    public void switchLight(){
        if(status == 1) {
            status = 0; 
            level = 0;  
            System.out.println("Lights are now OFF.");
        } 
        else{
            status = 1; 
            level = 1;  
            System.out.println("Lights are now ON.");
        }
    }

    public void adjustBrightness(int x){
        if(status == 0){
            System.out.println("Please turn on the light first!");
            
        }
        int newBrightness = level + x;
        if(newBrightness < 0 || newBrightness > 10){
            System.out.println("Brightness out of range. Set between 0 to 10.");
        } 
        else{
            level = newBrightness;
            System.out.println("Brightness adjusted.");
        }
    }
    public String resetSettings(){
        if(status == 1){
            level = 1; 
        }
        
    else{
     level = 0; 
        }
        return "Light settings have been reset.";
    }
}
