// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // Write the code here. You can run the code by 
        // selecting Run->Run File from the menu or by pressing Shift+F6
        Scanner reader = new Scanner(System.in);
        
        
        System.out.println("Who is greeted?");
        String name = reader.nextLine();
        
       
        
        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        
        System.out.println("Hi, " + name + " you are " + age + " years old");
        

    }
}
