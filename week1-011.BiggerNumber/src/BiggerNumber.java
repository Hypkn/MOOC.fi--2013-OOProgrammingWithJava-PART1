
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        int largerNum = 0;
        
        if(num1 > num2 ) {
            largerNum = num1;
        }else {
        largerNum = num2;
        }
        System.out.println("The bigger number of the two numbers given was: " + largerNum);
        
            
    }
     
}