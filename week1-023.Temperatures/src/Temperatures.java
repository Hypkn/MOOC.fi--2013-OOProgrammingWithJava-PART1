
import static java.lang.System.exit;
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Give temperature [between -30 and 40] or quit [100]: ");
            double value = Double.parseDouble(reader.nextLine());
            if(value == 100) {
                break;
            }

            if (value >= -30 && value <= 40) {
                Graph.addNumber(value);  
            } else {
                System.out.println("Out of range. \n");
            }
        }
        // Write your code here. 
        /*while (true) {
            System.out.println("Enter a number(float): ");
            double number = Double.parseDouble(reader.nextLine());

            if (number >= -30 && number <= 40) {
                Graph.addNumber(number);
                System.out.println("Continue(yes/no)? ");
                String choice = reader.nextLine();

                if (choice.equals("no")) {
                    exit(0);

                }
            } else {
               
                System.out.println("Enter a number between -30 and +40");
                 System.out.println(" "); */
            }

        }

    



        // Graph is used as follows:
//Graph.addNumber(7);
       /* double value = 13.5;
 Graph.addNumber(value);
 value = 3;
 /Graph.addNumber(value);*/
// Remove or comment out these lines above before trying to run the tests.


