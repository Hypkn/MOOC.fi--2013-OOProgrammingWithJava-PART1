
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten players based on goals: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 players based on penalty amounts: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Statistics for Sidney Crosby: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Statistics Philadelphia Flyers:  ");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
      
        
        System.out.println("Anaheim Ducks Stats by Points: ");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
                
        
        
    }
}



//Print the top ten players based on goals
//Print the top 25 players based on penalty amounts
//Print the statistics for Sidney Crosby
//Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in which order the players are printed in and why that might be!
//Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points