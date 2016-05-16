
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
       
            System.out.println("Until what?");
            int num = Integer.parseInt(reader.nextLine());
            int count = 1;
            int sum = 0;
            
            while(count  <=  num){
                 sum += count;
                count += 1;
               
                    
              }
            System.out.println("Sum is " + sum);

    }
}
