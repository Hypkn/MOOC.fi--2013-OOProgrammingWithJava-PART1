import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
       ArrayList<Integer> summed = new ArrayList<Integer>();
         int sum = 0;
        for(int numbers: list){
            sum += numbers;
    }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (double)sum(list) / list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        
        double average = average(list);
        
        double var = 0;
        for(double numbers : list) {
            var += (numbers- average)*(numbers-average);
        
        }
        
           
        return var / (list.size()-1);
       
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
