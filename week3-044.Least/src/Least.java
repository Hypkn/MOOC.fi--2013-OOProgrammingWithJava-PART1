
public class Least {

    

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
    
    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        // method needs a return in the end
        if(number1 == number2){
            return number1;
        }
        return Math.min(number1, number2);
        
    }
}
