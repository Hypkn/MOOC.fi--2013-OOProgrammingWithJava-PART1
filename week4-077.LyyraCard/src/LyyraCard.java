/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class LyyraCard {
    private double balance;
    private final double ECONOMICAL = 2.5;
    private final double GOURMET = 4.00;
    
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    public String toString(){
        return "The card has " + this.balance + " euros";
     
    }
    
    public void payEconomical(){
        if(this.balance < ECONOMICAL){
            System.out.println("Insufficent balance");
        }else{
            this.balance -= ECONOMICAL;
        }
        
    }
    
    public void payGourmet(){
           
        if(this.balance < GOURMET){
            System.out.println("Insufficent balance");
        }else{
            this.balance -= GOURMET;
        }
     
      
    }
    
    public void loadMoney(double amount){
        double max = 150;
        double addition = this.balance + amount;
        
        if(amount > 0){
            this.balance += amount;
            
    }   if(addition > max) {
            this.balance = max;
        }
    }
    
}
