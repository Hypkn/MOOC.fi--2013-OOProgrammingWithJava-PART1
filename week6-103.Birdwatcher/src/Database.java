
/*import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
/*public class Database {

    private final Scanner reader;
    private int observed;
    private ArrayList<Birds> bird;

    public Database(Scanner reader) {
        this.reader = reader;
        bird = new ArrayList<Birds>();
    }

    public void getInput() {

        while (true) {
            System.out.print("? ");
            //String answer = reader.nextLine();
           String answer = answer(reader);
            
            if (answer.equals("quit")) {
               break;
            }

            if (answer.equals("Add")) {
                add();
            }
            if (answer.equals("Statistics")) {
                statistics();
            }

            if (answer.equals("Observation")) {

                observation();
            }
            
            if(answer.equals("Show")){
             System.out.print("What? ");
             String name = answer(reader);
                show(name);
            }

        }

    }

    public void add() {
        System.out.print("Name: ");
        String addedname =  answer(reader);
        System.out.print("Latin Name: ");
        String addedlatin = answer(reader);
        Birds addedbird = new Birds(addedname, addedlatin);

        bird.add(addedbird);

    }

    public void statistics() {
        for (Birds items : bird) {
            System.out.println(items.toString());
        }

    }

    public void observation() {
        ArrayList<Birds> observedBird = new ArrayList<Birds>();
        System.out.print("What was observed:? ");
        String name = answer(reader);
        for(Birds items:bird){
            if(items.toString().contains(name))
            {
                observedBird.add(items);
            }
        }
        
        return 
        

    }

    public void show(String name) {
        for (Birds items : bird) {
            if(items.toString().contains(name)){
                System.out.println(items.toString());
                
            }
            
        }
        
        
    }
    
    public  String answer(Scanner reader){
        String answer = reader.nextLine();
       return answer;
    }

}
  */