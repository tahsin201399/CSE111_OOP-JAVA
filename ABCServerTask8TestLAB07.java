package CSE111_LAB07_OOP;

public class ABCServerTask8TestLAB07 {
    public static void main (String args []){
        ABCServerTask8LAB07 server1 = new ABCServerTask8LAB07();
        server1.details();
        System.out.println("---------------");
        ABCServerTask8LAB07 server2 = new ABCServerTask8LAB07("Heroes Reborn",6);
        server2.details();
        System.out.println("---------------");
        server2.addMembers("Edward");
        server2.addMembers("William");
        System.out.println("----------------");
        server2.details();
        System.out.println("----------------");
        server2.addMembers("John", "Hero's Mentor");
        server2.addMembers("Albert", "Thunderstrike");
        server2.addMembers("Max", "Radiant Avenger");
        System.out.println("----------------");
        server2.details();
        System.out.println("----------------");
        server2.addMembers("Daniel");
        server2.addMembers("Donal", "Valor Knight");
        System.out.println("----------------");
        server2.details();
      }
     
}
