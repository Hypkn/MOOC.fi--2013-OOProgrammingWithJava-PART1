
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account bobsAccount = new Account("Bob's Account", 100.0);
        
        bobsAccount.deposit(20.0);
        System.out.println(bobsAccount);
    }

}
