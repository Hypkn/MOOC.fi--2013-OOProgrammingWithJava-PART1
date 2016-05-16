/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class Person {
    
    private String phNumber;
    private String name;
    
    public Person(String personName, String phoneNumber){
        this.name = personName;
        this.phNumber = phoneNumber;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getNumber(){
        return this.phNumber;
    }
    
    public void changeNumber(String newNumber){
       this.phNumber = newNumber;
    }
    
    public String toString(){
        return getName() + " number: " + getNumber();
    }
}
