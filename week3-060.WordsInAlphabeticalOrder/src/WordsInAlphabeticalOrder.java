
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            
            if(word.equals("")) {
                break;
            }
            
            words.add(word);
            
    
        }
        
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        
        System.out.println("You typed the following words: ");
        
        for(String word:words){
            System.out.println(word);    
                  
        }
               
    }
    
}
