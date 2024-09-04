package CSE111_LAB_OOP;

public class CSE111Lab4_CellPhoneTask9 {
    String model = "Unknown";
    String [] contacts = new String [3];
    int idx =0;
    int Count = 0 ;
    public void storeContact(String contact){
        if(idx <contacts.length){
            contacts[idx++]= contact;
            System.out.println("Contact Stored");
        }
        else{
            System.out.println("Memory full. New contact can't be stored." );

        }

    }
    public void printDetails(){
        System.out.println("Phone Model " + model );
        System.out.println("Contacts Stored " + idx );

        if(Count == 0 && idx > 0){
            System.out.println("Stored Contacts: ");
            for(int i = 0 ; i < idx ; i++){
                System.out.println(contacts[i]);
            }
        }
        Count++;

    }
}

