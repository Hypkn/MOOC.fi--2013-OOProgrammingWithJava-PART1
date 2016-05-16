/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class Player {
    
   private String name;
   private int goals;
   
   
   public Player(String playerName){
       this.name = playerName;
   }
   
   public Player(String playerName, int amountOfGoals){
       this.name = playerName;
       this.goals = amountOfGoals;
   }
   
   
   public String getName(){
       return this.name;
   }
   
   public int goals() {
       return this.goals;
   }
   
   public String toString(){
       return getName() + ", " + "goals " + goals();
}
}
