
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

       // System.out.println("seconds : ");
       // int s = Integer.parseInt(reader.nextLine());
//        System.out.println("minutes: ");
//        int m = Integer.parseInt(reader.nextLine());
//        System.out.println("hours: ");
//        int h = Integer.parseInt(reader.nextLine());

       seconds.setValue(50);
       minutes.setValue(59);
       hours.setValue(23);

    //    int i = 0;

        while (true) {

            System.out.println(hours + ":" + minutes + ":" + seconds); // the current time printed
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            seconds.next();
           

            int j = seconds.getValue();
            if (j == 0) {
                minutes.next();  //advance minutes
            }

            int k = minutes.getValue();  //if minutes become zero, advance hours
            if (k == 0 && j == 0) {
                hours.next();
            }

           //i++;
        }

    }
}
