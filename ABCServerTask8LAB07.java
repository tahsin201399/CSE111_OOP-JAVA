package CSE111_LAB07_OOP;

public class ABCServerTask8LAB07 {
    public  String name;
    public int cap ;
    public  int memcount;
    public String [] membernames;
    public String[] memberRoles;
    public ABCServerTask8LAB07(){
        name = "Default";
        cap = 10;
        memcount = 0;
        membernames = new String[cap];
        memberRoles = new String[cap];

    }
    public ABCServerTask8LAB07(String x , int y){
        this.name = x;
        this.cap = y;
        this.memcount = 0;
        this.membernames = new String[cap];
        this.memberRoles = new String[cap];
    }
    public void details(){
        System.out.println("Server Name: " + name);
        System.out.println("Member Capacity: " + cap);
        System.out.println("Total Members: " + memcount);
        System.out.println("Members:");
        for (int i = 0; i < memcount; i++) {
            System.out.println("Name:Role --> " + membernames[i] + ":" + memberRoles[i]);
        }
    }
    public void addMembers(String name , String role){
        if(memcount < cap){
            membernames[memcount] = name;  
            memberRoles[memcount] = role;  
            memcount++;  
            System.out.println(role + " is added.");
        } 
        else{
            System.out.println("Sorry, maximum capacity exceeded!");
        }
    }
    public void addMembers(String name){
        if(memcount < cap){
            membernames[memcount] = name;        
            memberRoles[memcount] = "Rising Hero"; 
            memcount++;  
            System.out.println("Rising Hero is added.");
        } 
        else{
            System.out.println("Sorry, maximum capacity exceeded!");
        }
    }
    
}
