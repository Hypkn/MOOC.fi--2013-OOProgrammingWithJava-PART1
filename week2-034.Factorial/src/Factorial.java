import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int factorial = Integer.parseInt(reader.nextLine());
        
        int sum = 1;
        int number = 1;
        
        while(number <= factorial) {
           sum *= number;
            number +=1;
             
            
        }
        
        System.out.println("Factorial is " + sum);

    }
}
