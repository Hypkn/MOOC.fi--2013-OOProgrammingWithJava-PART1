

import java.util.Random;

public class PasswordRandomizer {

    private int length;
    private Random random = new Random();
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        

        int number = length;
        String s = "";

        for (int i = 0; i < number; i++) {
            
            int myChar = random.nextInt(alphabet.length());
            char symbol = alphabet.charAt(myChar);
            s += symbol;
         
               
                

          
            
        }
        return s;
    }
}
