
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");
        while (true) {

            int number = Integer.parseInt(reader.nextLine());
            if (number != -1) {
                sum.addNumber(number);

                if (number % 2 == 0) {
                    even.addNumber(number);
                } else {
                    odd.addNumber(number);
                }
            } else {

                System.out.println("sum: " + sum.sum());
                System.out.println("sum of even: " + even.sum());
                System.out.println("sum of odd: " + odd.sum());
                break;
            }

        }

    }

      //  stats.addNumber(3);
    //  stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);
//        System.out.println("Amount:" +stats.amountOfNumbers());
//        System.out.println("Sum: " + stats.sum());
//        System.out.println("Average: " + stats.average());
}
