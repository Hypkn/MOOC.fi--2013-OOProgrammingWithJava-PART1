
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]");
        int grade = Integer.parseInt(reader.nextLine());
        
        System.out.println("Grade: ");
        if(grade <= 29) {
            System.out.println("failed");
        }else if(grade >= 30 && grade < 35 ) {
            System.out.println(1);
                       
        }else if(grade >= 35 && grade < 40 ){
            System.out.println(2);
        }else if(grade >=40  && grade < 45 ){
            System.out.println(3);
        }else if(grade >= 45 && grade < 50 ){
            System.out.println(4);
        }else if(grade >= 50 && grade < 61 ){
            System.out.println(5);
        }else {
            System.out.println("Unknown");
        }

    }
}
