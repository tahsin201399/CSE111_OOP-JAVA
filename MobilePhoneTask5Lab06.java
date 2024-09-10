package CSE111_LAB06_OOP;

public class MobilePhoneTask5Lab06 {
    public String[] names; 
    public int[] numbers; 
    public int capacity; 
    public int totalContacts = 0; 

    public void setContactCapacity(int capacity){
        this.capacity = capacity;
        this.names = new String[capacity];
        this.numbers = new int[capacity];
    }

    public void details(){
        System.out.println("Total Contacts: " + totalContacts);
        System.out.println("Contact List:");
        if(totalContacts == 0){
            System.out.println("No contacts added yet.");
        } 
        else{
            for(int i = 0; i < totalContacts; i++){
                System.out.println(names[i] + ":" + numbers[i]);
            }
        }
    }

    public void addContact(String name, int number){
        if(totalContacts < capacity){
            names[totalContacts] = name;
            numbers[totalContacts] = number;
            totalContacts++;
            System.out.println("The contact of " + name + " is added.");
        }
         else{
            System.out.println("Storage Full!!");
        }
    }

    public void makeCall(int number){
        for (int i = 0; i < totalContacts; i++){
            if(numbers[i] == number){
                System.out.println("Calling " + names[i] + " . . .");
                
            }
        }
        System.out.println("Calling " + number + " . . .");
    }
}
