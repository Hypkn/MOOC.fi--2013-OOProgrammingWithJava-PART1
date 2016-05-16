
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class Team {
    
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    
    public Team(String teamName){
        this.name = teamName;
        players = new ArrayList<Player>();
        this.maxSize = 16;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        
        if(this.size() < this.maxSize) {
            players.add(player);
        
         }
    }
    
    public void printPlayers(){
        for(Player roster: this.players){
            System.out.println(roster);
        }
    }
    
    public void setMaxSize(int maxSize) {
     
        this.maxSize = maxSize;
      //this.players = new ArrayList<Player>(this.maxSize);
           
   
       
    }
    
       
    public int size(){
        return players.size();
    }
    
    public int goals(){
        int totalGoals = 0;
        for(Player goal: players){
            totalGoals += goal.goals();
            
        }
        return  totalGoals;
    }
    
}
