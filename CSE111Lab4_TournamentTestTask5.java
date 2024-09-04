package CSE111_LAB_OOP;

public class CSE111Lab4_TournamentTestTask5{
    public static void main(String [] args){
        CSE111Lab4_TournamentTask5 asiaCup = new CSE111Lab4_TournamentTask5();
      System.out.println(asiaCup.name+" "+ asiaCup.sportsType+" "+asiaCup.numberOfteams+" "+asiaCup.teams);
      System.out.println("**************");
      asiaCup.name="Asia Cup";
      asiaCup.sportsType="Cricket";
      asiaCup.numberOfteams=4;
      asiaCup.teams = new String[] {"BD","IND","PAK","SL"};
      System.out.printf("%s %s Tournament is played between %d teams\n",asiaCup.name, asiaCup.sportsType, asiaCup.numberOfteams);
      System.out.println("The teams are:");
      for(int i=0; i<asiaCup.teams.length; i++){
          System.out.println(asiaCup.teams[i]);
      }
    }
  }
  
  

