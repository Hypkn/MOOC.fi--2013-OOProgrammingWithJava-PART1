
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
public class Phonebook {
    
    private ArrayList<Person> persons = new ArrayList<Person>();
    
    
    
    public void add(String name, String number){
        Person people = new Person(name, number);
        
        persons.add(people);
        
        
    }
    
    public void printAll(){
        for(Person items: persons){
        System.out.println(items);
    }
    
}
    
    
    public String searchNumber(String name){
        for(Person list:persons){
            if(list.getName().contains(name)){
           return "" + list.getNumber();
            }
        }
        
        return "number not known";
        
    }
}
