
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int start = 1;
        System.out.println("Up to what number? ");
        int num = Integer.parseInt(reader.nextLine());
        
        while(start <= num){
            System.out.println(start);
            start+=1;
        }
        
    }
}
